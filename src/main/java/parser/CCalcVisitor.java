// Generated from /Users/noye/Documents/Teaching/FIL1/SELP/workspace/CCalcV0/src/parser/CCalc.g4 by ANTLR 4.1
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
	 * Visit a parse tree produced by {@link CCalcParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(@NotNull CCalcParser.BodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link CCalcParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull CCalcParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link CCalcParser#IntLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLit(@NotNull CCalcParser.IntLitContext ctx);
}