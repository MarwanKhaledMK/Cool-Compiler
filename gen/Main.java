import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static BufferedWriter writer, writer2 ;
    /**
     Take the name of cool code file and compile it through out lexical & Parsing analysis

     It's the Main function responsible to lunch the program
     - lexical analysis
     - parsing analysis
     @returns output the lexer tokens and draw the parse tree if there's no syntax error
     */
    public static void main(String[] args) throws Exception {
        //boolean exists ;
        String inputFilePath = "", outputFilePath = "";

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter file Name: ");
        inputFilePath = "testcases/" + reader.nextLine().split("/")[0] + ".cl";

        outputFilePath = inputFilePath.substring(inputFilePath.indexOf("/") + 1);
        outputFilePath = outputFilePath.substring(0, outputFilePath.indexOf("."));
        outputFilePath = "output/" + outputFilePath;

        writer = new BufferedWriter(new FileWriter(outputFilePath, true));
        writer2 = new BufferedWriter(new FileWriter(outputFilePath, true));

        CharStream input = CharStreams.fromFileName(inputFilePath);
        Cool_lexer lexer = new Cool_lexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();
        List<Token> allTokens = tokens.getTokens();

        //to detect if there is an error in lexems
        Boolean err = false;
        for (int i = 0; i < allTokens.size(); i++) {
            if (allTokens.get(i).getType() == 49) {
                err = true;
                System.out.print("\n" + "ERROR: ");
                System.out.printf("%3d: ", allTokens.get(i).getLine());
                System.out.print("lexer: invalid character: "
                        + allTokens.get(i).getText());
            }
        }
        if (!err) {
            System.out.println("The file passes lexer test.");
            writeLexerOutput(outputFilePath + ".cl-lex", allTokens, allTokens.size());
            //--------------------------------------------------------------------------------------------------------------
            try {
                System.out.println("Generating three addressing code...");
                //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
                FileInputStream fis = new FileInputStream(new File(inputFilePath));
                ANTLRInputStream inp = new ANTLRInputStream(fis);
                lex lexe = new lex(inp);
                CommonTokenStream tokenStream = new CommonTokenStream(lexe);
                tokenStream.fill();
                parse pars = new parse(tokenStream);
                pars.removeErrorListeners();
                pars.addErrorListener(new ThrowingErrorListener());



                parse.ProgramContext pro = pars.program();
                pro.value.gen();
                for(String s: AST_.prog3AdCode){
                    System.out.println(s);
                    writer.write(s + "\n");
                }

                //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
                // parser uses tokens.
                Cool_parser parser = new Cool_parser(tokens);
                // assign the parser program to the tree to be viewed later.
                ParseTree tree = parser.program();
                // a tree viewer which displays the program hierarchical structure as a tree,
                // given the tree itself and rules names.
                TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
                // opens the JFrame on which the tree was illustrated.
                viewer.open();
                System.out.println("The output of the syntax tree was opened in an external window.");
                // to print the structure of the tree in a single line.
//                System.out.println(tree.toStringTree(parser));
            }catch (ParseCancellationException e){
                System.out.println("Parsing was cancelled due to some error.");
            }
            //--------------------------------------------------------------------------------------------------------------
        }


    }
    /**
     This function write out the output of lexical analysis into inputfile.cl-lex format

     @param fileName Name of targeted COOL file.
     @param tokens Generated tokens of that file using ANTLR libs.
     @param noOfLines # of lines in COOL file.
     @returns write out the tokens and their types in specific format.
     */
    private static void writeLexerOutput(String fileName, List<Token> tokens, int noOfLines) {
        File file = new File(fileName);
        FileWriter fr = null;
        BufferedWriter br = null;
        String dataWithNewLine = "";
        try {
            fr = new FileWriter(file);
            br = new BufferedWriter(fr);
            for (int i = noOfLines; i > 0; i--) {
                dataWithNewLine +=
                        tokens.get(noOfLines - i).getLine() +
                                "\n" + Cool_lexer.getTokenName(tokens.get(noOfLines - i).getType());
//                        "Line : " + tokens.get(noOfLines-i).getLine() +
//                                ", Type : " + tokens.get(noOfLines-i).getType() +
//                                ", Value : " + tokens.get(noOfLines-i).getText() ;

                if (tokens.get(noOfLines - i).getType() >= 17 && tokens.get(noOfLines - i).getType() <= 20)
                    dataWithNewLine += "\n" + tokens.get(noOfLines - i).getText();
                br.write(dataWithNewLine);
                br.newLine();
                dataWithNewLine = "";
            }
            System.out.println("\n**Lexical analysis is done, tokens file was generated in the output directory.**");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
