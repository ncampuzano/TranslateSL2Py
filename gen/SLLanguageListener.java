// Generated from C:/Users/Nicolas Campuzano/iCloudDrive/Universidad Nacional/Semestre IX/Progamming Languages/TranslateSL2Py/grammar\SLLanguage.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SLLanguageParser}.
 */
public interface SLLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(SLLanguageParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(SLLanguageParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#settings}.
	 * @param ctx the parse tree
	 */
	void enterSettings(SLLanguageParser.SettingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#settings}.
	 * @param ctx the parse tree
	 */
	void exitSettings(SLLanguageParser.SettingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#assignationConst}.
	 * @param ctx the parse tree
	 */
	void enterAssignationConst(SLLanguageParser.AssignationConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#assignationConst}.
	 * @param ctx the parse tree
	 */
	void exitAssignationConst(SLLanguageParser.AssignationConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#assignationTypes}.
	 * @param ctx the parse tree
	 */
	void enterAssignationTypes(SLLanguageParser.AssignationTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#assignationTypes}.
	 * @param ctx the parse tree
	 */
	void exitAssignationTypes(SLLanguageParser.AssignationTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#assignationVar}.
	 * @param ctx the parse tree
	 */
	void enterAssignationVar(SLLanguageParser.AssignationVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#assignationVar}.
	 * @param ctx the parse tree
	 */
	void exitAssignationVar(SLLanguageParser.AssignationVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#objeto}.
	 * @param ctx the parse tree
	 */
	void enterObjeto(SLLanguageParser.ObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#objeto}.
	 * @param ctx the parse tree
	 */
	void exitObjeto(SLLanguageParser.ObjetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(SLLanguageParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(SLLanguageParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SLLanguageParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SLLanguageParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(SLLanguageParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(SLLanguageParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(SLLanguageParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(SLLanguageParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#ifSentence}.
	 * @param ctx the parse tree
	 */
	void enterIfSentence(SLLanguageParser.IfSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#ifSentence}.
	 * @param ctx the parse tree
	 */
	void exitIfSentence(SLLanguageParser.IfSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#repeatSentence}.
	 * @param ctx the parse tree
	 */
	void enterRepeatSentence(SLLanguageParser.RepeatSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#repeatSentence}.
	 * @param ctx the parse tree
	 */
	void exitRepeatSentence(SLLanguageParser.RepeatSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#whileSentence}.
	 * @param ctx the parse tree
	 */
	void enterWhileSentence(SLLanguageParser.WhileSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#whileSentence}.
	 * @param ctx the parse tree
	 */
	void exitWhileSentence(SLLanguageParser.WhileSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#printSentence}.
	 * @param ctx the parse tree
	 */
	void enterPrintSentence(SLLanguageParser.PrintSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#printSentence}.
	 * @param ctx the parse tree
	 */
	void exitPrintSentence(SLLanguageParser.PrintSentenceContext ctx);
}