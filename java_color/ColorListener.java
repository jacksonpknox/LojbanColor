// Generated from Color.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ColorParser}.
 */
public interface ColorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ColorParser#folio}.
	 * @param ctx the parse tree
	 */
	void enterFolio(ColorParser.FolioContext ctx);
	/**
	 * Exit a parse tree produced by {@link ColorParser#folio}.
	 * @param ctx the parse tree
	 */
	void exitFolio(ColorParser.FolioContext ctx);
	/**
	 * Enter a parse tree produced by {@link ColorParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(ColorParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ColorParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(ColorParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ColorParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(ColorParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ColorParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(ColorParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ColorParser#cmavo}.
	 * @param ctx the parse tree
	 */
	void enterCmavo(ColorParser.CmavoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ColorParser#cmavo}.
	 * @param ctx the parse tree
	 */
	void exitCmavo(ColorParser.CmavoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ColorParser#lujvo}.
	 * @param ctx the parse tree
	 */
	void enterLujvo(ColorParser.LujvoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ColorParser#lujvo}.
	 * @param ctx the parse tree
	 */
	void exitLujvo(ColorParser.LujvoContext ctx);
}