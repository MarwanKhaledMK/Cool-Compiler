// Generated from E:/Computer Engineering & Communications/4 - Computer Engineering Fourth Year/2nd Term/Compilers/ParserProject/src\Cool_parser.g4 by ANTLR 4.8


	import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Cool_parser}.
 */
public interface Cool_parserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Cool_parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Cool_parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Cool_parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classes}
	 * labeled alternative in {@link Cool_parser#programBlocks}.
	 * @param ctx the parse tree
	 */
	void enterClasses(Cool_parser.ClassesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classes}
	 * labeled alternative in {@link Cool_parser#programBlocks}.
	 * @param ctx the parse tree
	 */
	void exitClasses(Cool_parser.ClassesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EOF}
	 * labeled alternative in {@link Cool_parser#programBlocks}.
	 * @param ctx the parse tree
	 */
	void enterEOF(Cool_parser.EOFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EOF}
	 * labeled alternative in {@link Cool_parser#programBlocks}.
	 * @param ctx the parse tree
	 */
	void exitEOF(Cool_parser.EOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cool_parser#classDefine}.
	 * @param ctx the parse tree
	 */
	void enterClassDefine(Cool_parser.ClassDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_parser#classDefine}.
	 * @param ctx the parse tree
	 */
	void exitClassDefine(Cool_parser.ClassDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cool_parser#featureList}.
	 * @param ctx the parse tree
	 */
	void enterFeatureList(Cool_parser.FeatureListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_parser#featureList}.
	 * @param ctx the parse tree
	 */
	void exitFeatureList(Cool_parser.FeatureListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cool_parser#feature}.
	 * @param ctx the parse tree
	 */
	void enterFeature(Cool_parser.FeatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_parser#feature}.
	 * @param ctx the parse tree
	 */
	void exitFeature(Cool_parser.FeatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cool_parser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(Cool_parser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_parser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(Cool_parser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cool_parser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(Cool_parser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_parser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(Cool_parser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cool_parser#formalList}.
	 * @param ctx the parse tree
	 */
	void enterFormalList(Cool_parser.FormalListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_parser#formalList}.
	 * @param ctx the parse tree
	 */
	void exitFormalList(Cool_parser.FormalListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cool_parser#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormal(Cool_parser.FormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_parser#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormal(Cool_parser.FormalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cool_parser#branch_list}.
	 * @param ctx the parse tree
	 */
	void enterBranch_list(Cool_parser.Branch_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_parser#branch_list}.
	 * @param ctx the parse tree
	 */
	void exitBranch_list(Cool_parser.Branch_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cool_parser#branch_entity}.
	 * @param ctx the parse tree
	 */
	void enterBranch_entity(Cool_parser.Branch_entityContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_parser#branch_entity}.
	 * @param ctx the parse tree
	 */
	void exitBranch_entity(Cool_parser.Branch_entityContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cool_parser#e_list}.
	 * @param ctx the parse tree
	 */
	void enterE_list(Cool_parser.E_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_parser#e_list}.
	 * @param ctx the parse tree
	 */
	void exitE_list(Cool_parser.E_listContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letIn}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLetIn(Cool_parser.LetInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letIn}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLetIn(Cool_parser.LetInContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minus}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinus(Cool_parser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinus(Cool_parser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dispatch}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDispatch(Cool_parser.DispatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dispatch}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDispatch(Cool_parser.DispatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterString(Cool_parser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitString(Cool_parser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIsvoid(Cool_parser.IsvoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIsvoid(Cool_parser.IsvoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterWhile(Cool_parser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitWhile(Cool_parser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessOREqual}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLessOREqual(Cool_parser.LessOREqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessOREqual}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLessOREqual(Cool_parser.LessOREqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code division}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivision(Cool_parser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code division}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivision(Cool_parser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negative}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegative(Cool_parser.NegativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negative}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegative(Cool_parser.NegativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolNot}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolNot(Cool_parser.BoolNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolNot}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolNot(Cool_parser.BoolNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Cool_parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Cool_parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(Cool_parser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(Cool_parser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(Cool_parser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(Cool_parser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIf(Cool_parser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIf(Cool_parser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code own_dispatch_call}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOwn_dispatch_call(Cool_parser.Own_dispatch_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code own_dispatch_call}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOwn_dispatch_call(Cool_parser.Own_dispatch_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCase(Cool_parser.CaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCase(Cool_parser.CaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code new}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNew(Cool_parser.NewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code new}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNew(Cool_parser.NewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(Cool_parser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(Cool_parser.ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smallerThan}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSmallerThan(Cool_parser.SmallerThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smallerThan}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSmallerThan(Cool_parser.SmallerThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Cool_parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Cool_parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code false}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFalse(Cool_parser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code false}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFalse(Cool_parser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code static_dispatch}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStatic_dispatch(Cool_parser.Static_dispatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code static_dispatch}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStatic_dispatch(Cool_parser.Static_dispatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(Cool_parser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(Cool_parser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plus}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlus(Cool_parser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlus(Cool_parser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equal}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqual(Cool_parser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqual(Cool_parser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code true}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTrue(Cool_parser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code true}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTrue(Cool_parser.TrueContext ctx);
}