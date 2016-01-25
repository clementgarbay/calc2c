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
	 * Visit a parse tree produced by {@link CCalcParser#BooLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooLit(@NotNull CCalcParser.BooLitContext ctx);

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