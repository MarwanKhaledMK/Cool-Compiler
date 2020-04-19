// Generated from E:/Computer Engineering & Communications/4 - Computer Engineering Fourth Year/2nd Term/Compilers/ParserProject/src\Cool_lexer.g4 by ANTLR 4.8

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
/**
 {@link #Cool_lexer} <p>This class provides access to the current version of the ANTLR 4 runtime library as compile-time and runtime constants,
 along with methods for checking for matching version numbers and notifying listeners in the case where a version mismatch is detected.
 The runtime version information is provided by VERSION and getRuntimeVersion().
 Detailed information about these values is provided in the documentation for each member.

 The runtime version check is implemented by checkVersion(java.lang.String, java.lang.String).
 Detailed information about incorporating this call into user code, as well as its use in generated code,
 is provided in the documentation for the method.

 Version strings x.y and x.y.z are considered "compatible" and no error would be generated. Likewise,
 version strings x.y-SNAPSHOT and x.y.z are considered "compatible" because the major and minor components x.y are the same in each.

 To trap any error messages issued by this code, use System.setErr() in your main() startup code.</p>

 @returns check Version.
 */
public class Cool_lexer extends Lexer {
    static {
        RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            INHERITS = 1, CLASS = 2, NEW = 3, SELF = 4, IF = 5, THEN = 6, ELSE = 7, FI = 8, CASE = 9,
            OF = 10, ESAC = 11, WHILE = 12, LOOP = 13, POOL = 14, LET = 15, IN = 16, INTEGER = 17,
            LITERAL = 18, TYPE = 19, ID = 20, ASSIGN_OPERATOR = 21, CASE_ARROW = 22, EQUAL = 23,
            SMALLER_THAN = 24, BIGGER_THAN = 25, LESS_THAN_OR_EQUAL = 26, PLUS = 27, MINUS = 28,
            DIVIDE = 29, MULTIPLY = 30, INTEGER_NEGATIVE = 31, WHITESPACE = 32, NEWLINE = 33,
            OPEN_COMMENT = 34, CLOSE_COMMENT = 35, COMMENT = 36, ONE_LINE_COMMENT = 37, OPEN_CURLY = 38,
            CLOSE_CURLY = 39, OPENP_PRANSIS = 40, CLOSE_PRANSIS = 41, OPEN_SQUARE = 42, CLOSE_SQUARE = 43,
            SEMICOLUN = 44, COLUN = 45, COMMA = 46, DOT = 47, AT = 48, ERROR = 49, ISVOID = 50,
            NOT = 51, TRUE = 52, FALSE = 53, IDENTIFIER = 54, LARROW = 55, LBRACE = 56, LE = 57,
            LPAREN = 58, LT = 59, RARROW = 60, RBRACE = 61, RPAREN = 62, SEMI = 63, STRING = 64,
            TILDE = 65, TIMES = 66;
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    private static String[] makeRuleNames() {
        return new String[]{
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
                "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "INHERITS",
                "CLASS", "NEW", "SELF", "IF", "THEN", "ELSE", "FI", "CASE", "OF", "ESAC",
                "WHILE", "LOOP", "POOL", "LET", "IN", "INTEGER", "LITERAL", "TYPE", "ID",
                "ASSIGN_OPERATOR", "CASE_ARROW", "EQUAL", "SMALLER_THAN", "BIGGER_THAN",
                "LESS_THAN_OR_EQUAL", "PLUS", "MINUS", "DIVIDE", "MULTIPLY", "INTEGER_NEGATIVE",
                "WHITESPACE", "NEWLINE", "OPEN_COMMENT", "CLOSE_COMMENT", "COMMENT",
                "ONE_LINE_COMMENT", "OPEN_CURLY", "CLOSE_CURLY", "OPENP_PRANSIS", "CLOSE_PRANSIS",
                "OPEN_SQUARE", "CLOSE_SQUARE", "SEMICOLUN", "COLUN", "COMMA", "DOT",
                "AT", "ERROR", "ISVOID", "NOT", "TRUE", "FALSE", "IDENTIFIER", "LARROW",
                "LBRACE", "LE", "LPAREN", "LT", "RARROW", "RBRACE", "RPAREN", "SEMI",
                "STRING", "TILDE", "TIMES"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, "'<-'", "'=>'",
                "'='", "'<'", "'>'", "'<='", "'+'", "'-'", "'/'", "'*'", "'~'", null,
                null, "'(*'", "'*)'", null, null, "'{'", "'}'", "'('", "')'", "'['",
                "']'", "';'", "':'", "','", "'.'", "'@'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, "INHERITS", "CLASS", "NEW", "SELF", "IF", "THEN", "ELSE", "FI",
                "CASE", "OF", "ESAC", "WHILE", "LOOP", "POOL", "LET", "IN", "INTEGER",
                "LITERAL", "TYPE", "ID", "ASSIGN_OPERATOR", "CASE_ARROW", "EQUAL", "SMALLER_THAN",
                "BIGGER_THAN", "LESS_THAN_OR_EQUAL", "PLUS", "MINUS", "DIVIDE", "MULTIPLY",
                "INTEGER_NEGATIVE", "WHITESPACE", "NEWLINE", "OPEN_COMMENT", "CLOSE_COMMENT",
                "COMMENT", "ONE_LINE_COMMENT", "OPEN_CURLY", "CLOSE_CURLY", "OPENP_PRANSIS",
                "CLOSE_PRANSIS", "OPEN_SQUARE", "CLOSE_SQUARE", "SEMICOLUN", "COLUN",
                "COMMA", "DOT", "AT", "ERROR", "ISVOID", "NOT", "TRUE", "FALSE", "IDENTIFIER",
                "LARROW", "LBRACE", "LE", "LPAREN", "LT", "RARROW", "RBRACE", "RPAREN",
                "SEMI", "STRING", "TILDE", "TIMES"
        };
    }

    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /**
     * {@link #getTokenName} Obtain token name.
     *
     * @param id Token ID.
     * @returns Token name corresponding to it's id.
     */
    public static String getTokenName(int id) {
        if (id == -1) return "EOF";
        else return _SYMBOLIC_NAMES[id];
    }

    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    /**
     {@link #getTokenNames()} getter function.

     @returns Token Name.
     */
    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    /**
     {@link #getVocabulary()} getter function.

     @returns VOCABULARY.
     */
    @Override
    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    /**
     Constructor of class {@link #Cool_lexer} .

     @param input CharStream class object which contain the path to COOL code file.
     @returns Interpret it into LexerATNSimulator .
     */
    public Cool_lexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

	/**
	 {@link #getGrammarFileName()} getter function.

	 @returns File Name of grammer.
	 */
    @Override
    public String getGrammarFileName() {
        return "Cool_lexer.g4";
    }

	/**
	 {@link #getRuleNames()} getter function.

	 @returns Name of Rule type.
	 */
    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

	/**
	 {@link #getSerializedATN()} getter function.

	 @returns _serializedATN.
	 */
    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

	/**
	 {@link #getChannelNames()} getter function.

	 @returns Channel Name wether it's hidden or default
	 */
    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

	/**
	 {@link #getModeNames()} getter function.

	 @returns Mode Name which is default always.
	 */
    @Override
    public String[] getModeNames() {
        return modeNames;
    }
	/**
	 {@link #getATN()} getter function.

	 @returns ATNDeserializer().deserialize(_serializedATN.toCharArray());.
	 */
    @Override
    public ATN getATN() {
        return _ATN;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2D\u021e\b\1\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
                    "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
                    "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I" +
                    "\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT" +
                    "\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\3\2\3\2\3\3\3" +
                    "\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3" +
                    "\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23" +
                    "\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32" +
                    "\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35" +
                    "\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3" +
                    " \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%" +
                    "\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)" +
                    "\3)\3*\3*\3*\3*\3+\3+\3+\3,\6,\u013d\n,\r,\16,\u013e\3-\3-\7-\u0143\n" +
                    "-\f-\16-\u0146\13-\3-\3-\3.\3.\7.\u014c\n.\f.\16.\u014f\13.\3/\3/\7/\u0153" +
                    "\n/\f/\16/\u0156\13/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63\3\63" +
                    "\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;" +
                    "\3;\3;\3<\5<\u0176\n<\3<\3<\5<\u017a\n<\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?" +
                    "\3?\7?\u0187\n?\f?\16?\u018a\13?\3?\3?\3?\3?\3@\3@\3@\3@\7@\u0194\n@\f" +
                    "@\16@\u0197\13@\3@\5@\u019a\n@\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F" +
                    "\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N" +
                    "\3N\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q" +
                    "\3R\3R\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S\3S\3S\3T\3T\3T\3U\3U\3U\3U\3U\3U" +
                    "\3U\3V\3V\3V\3W\3W\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y" +
                    "\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\3]" +
                    "\3]\3]\3]\3]\3]\3\u0188\2^\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25" +
                    "\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67" +
                    "\39\4;\5=\6?\7A\bC\tE\nG\13I\fK\rM\16O\17Q\20S\21U\22W\23Y\24[\25]\26" +
                    "_\27a\30c\31e\32g\33i\34k\35m\36o\37q s!u\"w#y${%}&\177\'\u0081(\u0083" +
                    ")\u0085*\u0087+\u0089,\u008b-\u008d.\u008f/\u0091\60\u0093\61\u0095\62" +
                    "\u0097\63\u0099\64\u009b\65\u009d\66\u009f\67\u00a18\u00a39\u00a5:\u00a7" +
                    ";\u00a9<\u00ab=\u00ad>\u00af?\u00b1@\u00b3A\u00b5B\u00b7C\u00b9D\3\2#" +
                    "\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2K" +
                    "Kkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4" +
                    "\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\" +
                    "||\3\2\62;\f\2\"#%\'))--/\60\62<B\\^^``c|\3\2C\\\6\2\62;C\\aac|\4\2C\\" +
                    "c|\4\2\13\13\"\"\3\2\f\f\2\u020d\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2" +
                    "=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3" +
                    "\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2" +
                    "\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2" +
                    "c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3" +
                    "\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2" +
                    "\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3" +
                    "\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2" +
                    "\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097" +
                    "\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2" +
                    "\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9" +
                    "\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2" +
                    "\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\3\u00bb" +
                    "\3\2\2\2\5\u00bd\3\2\2\2\7\u00bf\3\2\2\2\t\u00c1\3\2\2\2\13\u00c3\3\2" +
                    "\2\2\r\u00c5\3\2\2\2\17\u00c7\3\2\2\2\21\u00c9\3\2\2\2\23\u00cb\3\2\2" +
                    "\2\25\u00cd\3\2\2\2\27\u00cf\3\2\2\2\31\u00d1\3\2\2\2\33\u00d3\3\2\2\2" +
                    "\35\u00d5\3\2\2\2\37\u00d7\3\2\2\2!\u00d9\3\2\2\2#\u00db\3\2\2\2%\u00dd" +
                    "\3\2\2\2\'\u00df\3\2\2\2)\u00e1\3\2\2\2+\u00e3\3\2\2\2-\u00e5\3\2\2\2" +
                    "/\u00e7\3\2\2\2\61\u00e9\3\2\2\2\63\u00eb\3\2\2\2\65\u00ed\3\2\2\2\67" +
                    "\u00ef\3\2\2\29\u00f8\3\2\2\2;\u00fe\3\2\2\2=\u0102\3\2\2\2?\u0107\3\2" +
                    "\2\2A\u010a\3\2\2\2C\u010f\3\2\2\2E\u0114\3\2\2\2G\u0117\3\2\2\2I\u011c" +
                    "\3\2\2\2K\u011f\3\2\2\2M\u0124\3\2\2\2O\u012a\3\2\2\2Q\u012f\3\2\2\2S" +
                    "\u0134\3\2\2\2U\u0138\3\2\2\2W\u013c\3\2\2\2Y\u0140\3\2\2\2[\u0149\3\2" +
                    "\2\2]\u0150\3\2\2\2_\u0157\3\2\2\2a\u015a\3\2\2\2c\u015d\3\2\2\2e\u015f" +
                    "\3\2\2\2g\u0161\3\2\2\2i\u0163\3\2\2\2k\u0166\3\2\2\2m\u0168\3\2\2\2o" +
                    "\u016a\3\2\2\2q\u016c\3\2\2\2s\u016e\3\2\2\2u\u0170\3\2\2\2w\u0179\3\2" +
                    "\2\2y\u017d\3\2\2\2{\u0180\3\2\2\2}\u0183\3\2\2\2\177\u018f\3\2\2\2\u0081" +
                    "\u019d\3\2\2\2\u0083\u019f\3\2\2\2\u0085\u01a1\3\2\2\2\u0087\u01a3\3\2" +
                    "\2\2\u0089\u01a5\3\2\2\2\u008b\u01a7\3\2\2\2\u008d\u01a9\3\2\2\2\u008f" +
                    "\u01ab\3\2\2\2\u0091\u01ad\3\2\2\2\u0093\u01af\3\2\2\2\u0095\u01b1\3\2" +
                    "\2\2\u0097\u01b3\3\2\2\2\u0099\u01b5\3\2\2\2\u009b\u01bc\3\2\2\2\u009d" +
                    "\u01c0\3\2\2\2\u009f\u01c5\3\2\2\2\u00a1\u01cb\3\2\2\2\u00a3\u01d6\3\2" +
                    "\2\2\u00a5\u01dd\3\2\2\2\u00a7\u01e4\3\2\2\2\u00a9\u01e7\3\2\2\2\u00ab" +
                    "\u01ee\3\2\2\2\u00ad\u01f1\3\2\2\2\u00af\u01f8\3\2\2\2\u00b1\u01ff\3\2" +
                    "\2\2\u00b3\u0206\3\2\2\2\u00b5\u020b\3\2\2\2\u00b7\u0212\3\2\2\2\u00b9" +
                    "\u0218\3\2\2\2\u00bb\u00bc\t\2\2\2\u00bc\4\3\2\2\2\u00bd\u00be\t\3\2\2" +
                    "\u00be\6\3\2\2\2\u00bf\u00c0\t\4\2\2\u00c0\b\3\2\2\2\u00c1\u00c2\t\5\2" +
                    "\2\u00c2\n\3\2\2\2\u00c3\u00c4\t\6\2\2\u00c4\f\3\2\2\2\u00c5\u00c6\t\7" +
                    "\2\2\u00c6\16\3\2\2\2\u00c7\u00c8\t\b\2\2\u00c8\20\3\2\2\2\u00c9\u00ca" +
                    "\t\t\2\2\u00ca\22\3\2\2\2\u00cb\u00cc\t\n\2\2\u00cc\24\3\2\2\2\u00cd\u00ce" +
                    "\t\13\2\2\u00ce\26\3\2\2\2\u00cf\u00d0\t\f\2\2\u00d0\30\3\2\2\2\u00d1" +
                    "\u00d2\t\r\2\2\u00d2\32\3\2\2\2\u00d3\u00d4\t\16\2\2\u00d4\34\3\2\2\2" +
                    "\u00d5\u00d6\t\17\2\2\u00d6\36\3\2\2\2\u00d7\u00d8\t\20\2\2\u00d8 \3\2" +
                    "\2\2\u00d9\u00da\t\21\2\2\u00da\"\3\2\2\2\u00db\u00dc\t\22\2\2\u00dc$" +
                    "\3\2\2\2\u00dd\u00de\t\23\2\2\u00de&\3\2\2\2\u00df\u00e0\t\24\2\2\u00e0" +
                    "(\3\2\2\2\u00e1\u00e2\t\25\2\2\u00e2*\3\2\2\2\u00e3\u00e4\t\26\2\2\u00e4" +
                    ",\3\2\2\2\u00e5\u00e6\t\27\2\2\u00e6.\3\2\2\2\u00e7\u00e8\t\30\2\2\u00e8" +
                    "\60\3\2\2\2\u00e9\u00ea\t\31\2\2\u00ea\62\3\2\2\2\u00eb\u00ec\t\32\2\2" +
                    "\u00ec\64\3\2\2\2\u00ed\u00ee\t\33\2\2\u00ee\66\3\2\2\2\u00ef\u00f0\5" +
                    "\23\n\2\u00f0\u00f1\5\35\17\2\u00f1\u00f2\5\21\t\2\u00f2\u00f3\5\13\6" +
                    "\2\u00f3\u00f4\5%\23\2\u00f4\u00f5\5\23\n\2\u00f5\u00f6\5)\25\2\u00f6" +
                    "\u00f7\5\'\24\2\u00f78\3\2\2\2\u00f8\u00f9\5\7\4\2\u00f9\u00fa\5\31\r" +
                    "\2\u00fa\u00fb\5\3\2\2\u00fb\u00fc\5\'\24\2\u00fc\u00fd\5\'\24\2\u00fd" +
                    ":\3\2\2\2\u00fe\u00ff\5\35\17\2\u00ff\u0100\5\13\6\2\u0100\u0101\5/\30" +
                    "\2\u0101<\3\2\2\2\u0102\u0103\5\'\24\2\u0103\u0104\5\13\6\2\u0104\u0105" +
                    "\5\31\r\2\u0105\u0106\5\r\7\2\u0106>\3\2\2\2\u0107\u0108\5\23\n\2\u0108" +
                    "\u0109\5\r\7\2\u0109@\3\2\2\2\u010a\u010b\5)\25\2\u010b\u010c\5\21\t\2" +
                    "\u010c\u010d\5\13\6\2\u010d\u010e\5\35\17\2\u010eB\3\2\2\2\u010f\u0110" +
                    "\5\13\6\2\u0110\u0111\5\31\r\2\u0111\u0112\5\'\24\2\u0112\u0113\5\13\6" +
                    "\2\u0113D\3\2\2\2\u0114\u0115\5\r\7\2\u0115\u0116\5\23\n\2\u0116F\3\2" +
                    "\2\2\u0117\u0118\5\7\4\2\u0118\u0119\5\3\2\2\u0119\u011a\5\'\24\2\u011a" +
                    "\u011b\5\13\6\2\u011bH\3\2\2\2\u011c\u011d\5\37\20\2\u011d\u011e\5\r\7" +
                    "\2\u011eJ\3\2\2\2\u011f\u0120\5\13\6\2\u0120\u0121\5\'\24\2\u0121\u0122" +
                    "\5\3\2\2\u0122\u0123\5\7\4\2\u0123L\3\2\2\2\u0124\u0125\5/\30\2\u0125" +
                    "\u0126\5\21\t\2\u0126\u0127\5\23\n\2\u0127\u0128\5\31\r\2\u0128\u0129" +
                    "\5\13\6\2\u0129N\3\2\2\2\u012a\u012b\5\31\r\2\u012b\u012c\5\37\20\2\u012c" +
                    "\u012d\5\37\20\2\u012d\u012e\5!\21\2\u012eP\3\2\2\2\u012f\u0130\5!\21" +
                    "\2\u0130\u0131\5\37\20\2\u0131\u0132\5\37\20\2\u0132\u0133\5\31\r\2\u0133" +
                    "R\3\2\2\2\u0134\u0135\5\31\r\2\u0135\u0136\5\13\6\2\u0136\u0137\5)\25" +
                    "\2\u0137T\3\2\2\2\u0138\u0139\5\23\n\2\u0139\u013a\5\35\17\2\u013aV\3" +
                    "\2\2\2\u013b\u013d\t\34\2\2\u013c\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e" +
                    "\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013fX\3\2\2\2\u0140\u0144\7$\2\2\u0141" +
                    "\u0143\t\35\2\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3" +
                    "\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147" +
                    "\u0148\7$\2\2\u0148Z\3\2\2\2\u0149\u014d\t\36\2\2\u014a\u014c\t\37\2\2" +
                    "\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e" +
                    "\3\2\2\2\u014e\\\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0154\t \2\2\u0151" +
                    "\u0153\t\37\2\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3" +
                    "\2\2\2\u0154\u0155\3\2\2\2\u0155^\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158" +
                    "\7>\2\2\u0158\u0159\7/\2\2\u0159`\3\2\2\2\u015a\u015b\7?\2\2\u015b\u015c" +
                    "\7@\2\2\u015cb\3\2\2\2\u015d\u015e\7?\2\2\u015ed\3\2\2\2\u015f\u0160\7" +
                    ">\2\2\u0160f\3\2\2\2\u0161\u0162\7@\2\2\u0162h\3\2\2\2\u0163\u0164\7>" +
                    "\2\2\u0164\u0165\7?\2\2\u0165j\3\2\2\2\u0166\u0167\7-\2\2\u0167l\3\2\2" +
                    "\2\u0168\u0169\7/\2\2\u0169n\3\2\2\2\u016a\u016b\7\61\2\2\u016bp\3\2\2" +
                    "\2\u016c\u016d\7,\2\2\u016dr\3\2\2\2\u016e\u016f\7\u0080\2\2\u016ft\3" +
                    "\2\2\2\u0170\u0171\t!\2\2\u0171\u0172\3\2\2\2\u0172\u0173\b;\2\2\u0173" +
                    "v\3\2\2\2\u0174\u0176\7\17\2\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2" +
                    "\u0176\u0177\3\2\2\2\u0177\u017a\7\f\2\2\u0178\u017a\7\17\2\2\u0179\u0175" +
                    "\3\2\2\2\u0179\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\b<\2\2\u017c" +
                    "x\3\2\2\2\u017d\u017e\7*\2\2\u017e\u017f\7,\2\2\u017fz\3\2\2\2\u0180\u0181" +
                    "\7,\2\2\u0181\u0182\7+\2\2\u0182|\3\2\2\2\u0183\u0188\5y=\2\u0184\u0187" +
                    "\5}?\2\u0185\u0187\13\2\2\2\u0186\u0184\3\2\2\2\u0186\u0185\3\2\2\2\u0187" +
                    "\u018a\3\2\2\2\u0188\u0189\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018b\3\2" +
                    "\2\2\u018a\u0188\3\2\2\2\u018b\u018c\5{>\2\u018c\u018d\3\2\2\2\u018d\u018e" +
                    "\b?\2\2\u018e~\3\2\2\2\u018f\u0190\7/\2\2\u0190\u0191\7/\2\2\u0191\u0195" +
                    "\3\2\2\2\u0192\u0194\n\"\2\2\u0193\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195" +
                    "\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2" +
                    "\2\2\u0198\u019a\7\f\2\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019a" +
                    "\u019b\3\2\2\2\u019b\u019c\b@\2\2\u019c\u0080\3\2\2\2\u019d\u019e\7}\2" +
                    "\2\u019e\u0082\3\2\2\2\u019f\u01a0\7\177\2\2\u01a0\u0084\3\2\2\2\u01a1" +
                    "\u01a2\7*\2\2\u01a2\u0086\3\2\2\2\u01a3\u01a4\7+\2\2\u01a4\u0088\3\2\2" +
                    "\2\u01a5\u01a6\7]\2\2\u01a6\u008a\3\2\2\2\u01a7\u01a8\7_\2\2\u01a8\u008c" +
                    "\3\2\2\2\u01a9\u01aa\7=\2\2\u01aa\u008e\3\2\2\2\u01ab\u01ac\7<\2\2\u01ac" +
                    "\u0090\3\2\2\2\u01ad\u01ae\7.\2\2\u01ae\u0092\3\2\2\2\u01af\u01b0\7\60" +
                    "\2\2\u01b0\u0094\3\2\2\2\u01b1\u01b2\7B\2\2\u01b2\u0096\3\2\2\2\u01b3" +
                    "\u01b4\13\2\2\2\u01b4\u0098\3\2\2\2\u01b5\u01b6\5\23\n\2\u01b6\u01b7\5" +
                    "\'\24\2\u01b7\u01b8\5-\27\2\u01b8\u01b9\5\37\20\2\u01b9\u01ba\5\23\n\2" +
                    "\u01ba\u01bb\5\t\5\2\u01bb\u009a\3\2\2\2\u01bc\u01bd\5\35\17\2\u01bd\u01be" +
                    "\5\37\20\2\u01be\u01bf\5)\25\2\u01bf\u009c\3\2\2\2\u01c0\u01c1\7v\2\2" +
                    "\u01c1\u01c2\5%\23\2\u01c2\u01c3\5+\26\2\u01c3\u01c4\5\13\6\2\u01c4\u009e" +
                    "\3\2\2\2\u01c5\u01c6\7h\2\2\u01c6\u01c7\5\3\2\2\u01c7\u01c8\5\31\r\2\u01c8" +
                    "\u01c9\5\'\24\2\u01c9\u01ca\5\13\6\2\u01ca\u00a0\3\2\2\2\u01cb\u01cc\5" +
                    "\23\n\2\u01cc\u01cd\5\t\5\2\u01cd\u01ce\5\13\6\2\u01ce\u01cf\5\35\17\2" +
                    "\u01cf\u01d0\5)\25\2\u01d0\u01d1\5\23\n\2\u01d1\u01d2\5\r\7\2\u01d2\u01d3" +
                    "\5\23\n\2\u01d3\u01d4\5\13\6\2\u01d4\u01d5\5%\23\2\u01d5\u00a2\3\2\2\2" +
                    "\u01d6\u01d7\5\31\r\2\u01d7\u01d8\5\3\2\2\u01d8\u01d9\5%\23\2\u01d9\u01da" +
                    "\5%\23\2\u01da\u01db\5\37\20\2\u01db\u01dc\5/\30\2\u01dc\u00a4\3\2\2\2" +
                    "\u01dd\u01de\5\31\r\2\u01de\u01df\5\5\3\2\u01df\u01e0\5%\23\2\u01e0\u01e1" +
                    "\5\3\2\2\u01e1\u01e2\5\7\4\2\u01e2\u01e3\5\13\6\2\u01e3\u00a6\3\2\2\2" +
                    "\u01e4\u01e5\5\31\r\2\u01e5\u01e6\5\13\6\2\u01e6\u00a8\3\2\2\2\u01e7\u01e8" +
                    "\5\31\r\2\u01e8\u01e9\5!\21\2\u01e9\u01ea\5\3\2\2\u01ea\u01eb\5%\23\2" +
                    "\u01eb\u01ec\5\13\6\2\u01ec\u01ed\5\35\17\2\u01ed\u00aa\3\2\2\2\u01ee" +
                    "\u01ef\5\31\r\2\u01ef\u01f0\5)\25\2\u01f0\u00ac\3\2\2\2\u01f1\u01f2\5" +
                    "%\23\2\u01f2\u01f3\5\3\2\2\u01f3\u01f4\5%\23\2\u01f4\u01f5\5%\23\2\u01f5" +
                    "\u01f6\5\37\20\2\u01f6\u01f7\5/\30\2\u01f7\u00ae\3\2\2\2\u01f8\u01f9\5" +
                    "%\23\2\u01f9\u01fa\5\5\3\2\u01fa\u01fb\5%\23\2\u01fb\u01fc\5\3\2\2\u01fc" +
                    "\u01fd\5\7\4\2\u01fd\u01fe\5\13\6\2\u01fe\u00b0\3\2\2\2\u01ff\u0200\5" +
                    "%\23\2\u0200\u0201\5!\21\2\u0201\u0202\5\3\2\2\u0202\u0203\5%\23\2\u0203" +
                    "\u0204\5\13\6\2\u0204\u0205\5\35\17\2\u0205\u00b2\3\2\2\2\u0206\u0207" +
                    "\5\'\24\2\u0207\u0208\5\13\6\2\u0208\u0209\5\33\16\2\u0209\u020a\5\23" +
                    "\n\2\u020a\u00b4\3\2\2\2\u020b\u020c\5\'\24\2\u020c\u020d\5)\25\2\u020d" +
                    "\u020e\5%\23\2\u020e\u020f\5\23\n\2\u020f\u0210\5\35\17\2\u0210\u0211" +
                    "\5\17\b\2\u0211\u00b6\3\2\2\2\u0212\u0213\5)\25\2\u0213\u0214\5\23\n\2" +
                    "\u0214\u0215\5\31\r\2\u0215\u0216\5\t\5\2\u0216\u0217\5\13\6\2\u0217\u00b8" +
                    "\3\2\2\2\u0218\u0219\5)\25\2\u0219\u021a\5\23\n\2\u021a\u021b\5\33\16" +
                    "\2\u021b\u021c\5\13\6\2\u021c\u021d\5\'\24\2\u021d\u00ba\3\2\2\2\16\2" +
                    "\u013e\u0142\u0144\u014d\u0154\u0175\u0179\u0186\u0188\u0195\u0199\3\b" +
                    "\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}