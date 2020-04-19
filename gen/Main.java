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

    public static void main(String[] args) throws Exception {
        //boolean exists ;
        String inputFilePath = "", outputFilePath = "";

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter file Name: ");
        inputFilePath = "testcases/" + reader.nextLine().split("/")[0] + ".cl";

        outputFilePath = inputFilePath.substring(inputFilePath.indexOf("/") + 1);
        outputFilePath = outputFilePath.substring(0, outputFilePath.indexOf("."));
        outputFilePath = "output/" + outputFilePath;

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
            writeLexerOutput(outputFilePath + ".cl-lex", allTokens, allTokens.size());
            //--------------------------------------------------------------------------------------------------------------
            try {
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
                //System.out.println(tree.toStringTree(parser));
            }catch (ParseCancellationException e){
                System.out.println("Parsing was cancelled due to some error.");
            }
            //--------------------------------------------------------------------------------------------------------------
        }


    }

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
