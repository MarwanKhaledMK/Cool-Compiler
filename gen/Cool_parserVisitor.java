// Generated from E:/Computer Engineering & Communications/4 - Computer Engineering Fourth Year/2nd Term/Compilers/ParserProject/src\Cool_parser.g4 by ANTLR 4.8


	import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Cool_parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Cool_parserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Cool_parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Cool_parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classes}
	 * labeled alternative in {@link Cool_parser#programBlocks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasses(Cool_parser.ClassesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EOF}
	 * labeled alternative in {@link Cool_parser#programBlocks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEOF(Cool_parser.EOFContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cool_parser#classDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefine(Cool_parser.ClassDefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cool_parser#featureList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeatureList(Cool_parser.FeatureListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cool_parser#feature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeature(Cool_parser.FeatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cool_parser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(Cool_parser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cool_parser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(Cool_parser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cool_parser#formalList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalList(Cool_parser.FormalListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cool_parser#formal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal(Cool_parser.FormalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cool_parser#branch_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch_list(Cool_parser.Branch_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cool_parser#branch_entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch_entity(Cool_parser.Branch_entityContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cool_parser#e_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_list(Cool_parser.E_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letIn}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetIn(Cool_parser.LetInContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(Cool_parser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dispatch}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDispatch(Cool_parser.DispatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(Cool_parser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsvoid(Cool_parser.IsvoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(Cool_parser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessOREqual}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessOREqual(Cool_parser.LessOREqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code division}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(Cool_parser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negative}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegative(Cool_parser.NegativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolNot}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolNot(Cool_parser.BoolNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code block}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Cool_parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(Cool_parser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(Cool_parser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(Cool_parser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code own_dispatch_call}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwn_dispatch_call(Cool_parser.Own_dispatch_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code case}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase(Cool_parser.CaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code new}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew(Cool_parser.NewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(Cool_parser.ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code smallerThan}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallerThan(Cool_parser.SmallerThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Cool_parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code false}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(Cool_parser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code static_dispatch}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatic_dispatch(Cool_parser.Static_dispatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(Cool_parser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(Cool_parser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(Cool_parser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code true}
	 * labeled alternative in {@link Cool_parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(Cool_parser.TrueContext ctx);
}