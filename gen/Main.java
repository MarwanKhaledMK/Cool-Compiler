import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;
import java.util.List;
//import java.io.IOException;
//import java.io.File;
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
            if (allTokens.get(i).getType() == 52) {
                err = true;
                System.out.print("\n" + "ERROR: ");
                System.out.printf("%3d: ", allTokens.get(i).getLine());
                System.out.print("lexer: invalid character: "
                        + allTokens.get(i).getText());
            }
        }
        if (!err) {
            System.out.println("\n" + "The file passes lexer test.");
            writeLexerOutput(outputFilePath + ".cl-lex", allTokens, allTokens.size());
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
                if (tokens.get(noOfLines - i).getType() >= 20 && tokens.get(noOfLines - i).getType() <= 23)
                    dataWithNewLine += "\n" + tokens.get(noOfLines - i).getText();
                br.write(dataWithNewLine);
                br.newLine();
                dataWithNewLine = "";
            }
            System.out.println("Writing tokens file is done");
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
