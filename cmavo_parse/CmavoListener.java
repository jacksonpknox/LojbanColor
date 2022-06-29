// Generated from Cmavo.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CmavoParser}.
 */
public interface CmavoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CmavoParser#cmavo}.
	 * @param ctx the parse tree
	 */
	void enterCmavo(CmavoParser.CmavoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmavoParser#cmavo}.
	 * @param ctx the parse tree
	 */
	void exitCmavo(CmavoParser.CmavoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmavoParser#cat_cmavo}.
	 * @param ctx the parse tree
	 */
	void enterCat_cmavo(CmavoParser.Cat_cmavoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmavoParser#cat_cmavo}.
	 * @param ctx the parse tree
	 */
	void exitCat_cmavo(CmavoParser.Cat_cmavoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmavoParser#lerfu}.
	 * @param ctx the parse tree
	 */
	void enterLerfu(CmavoParser.LerfuContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmavoParser#lerfu}.
	 * @param ctx the parse tree
	 */
	void exitLerfu(CmavoParser.LerfuContext ctx);
}