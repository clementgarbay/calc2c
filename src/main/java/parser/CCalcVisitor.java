// Generated from /Users/clementgarbay/Documents/Mines/Langage de programmation/Structure et exécution des langages de programmation/calc2c/src/main/java/parser/CCalc.g4 by ANTLR 4.1
package parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CCalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CCalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CCalcParser#BinaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression(@NotNull CCalcParser.BinaryExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CCalcParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(@NotNull CCalcParser.BodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link CCalcParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(@NotNull CCalcParser.DefinitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CCalcParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull CCalcParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link CCalcParser#ParenthesizedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(@NotNull CCalcParser.ParenthesizedExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CCalcParser#IntegerType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerType(@NotNull CCalcParser.IntegerTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link CCalcParser#UnaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(@NotNull CCalcParser.UnaryExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CCalcParser#ConditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(@NotNull CCalcParser.ConditionalExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CCalcParser#StringType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringType(@NotNull CCalcParser.StringTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link CCalcParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull CCalcParser.VariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link CCalcParser#BooleanType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanType(@NotNull CCalcParser.BooleanTypeContext ctx);
}