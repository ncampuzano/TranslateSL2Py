// Generated from C:/Users/ALEJA/Documents/AntlrWorkspace/TranslateSL2Py/grammar\SLLanguage.g4 by ANTLR 4.7.2
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
	 * Enter a parse tree produced by {@link SLLanguageParser#tipoVector}.
	 * @param ctx the parse tree
	 */
	void enterTipoVector(SLLanguageParser.TipoVectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#tipoVector}.
	 * @param ctx the parse tree
	 */
	void exitTipoVector(SLLanguageParser.TipoVectorContext ctx);
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
	 * Enter a parse tree produced by {@link SLLanguageParser#bodyIfSentence}.
	 * @param ctx the parse tree
	 */
	void enterBodyIfSentence(SLLanguageParser.BodyIfSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#bodyIfSentence}.
	 * @param ctx the parse tree
	 */
	void exitBodyIfSentence(SLLanguageParser.BodyIfSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#sinoSentence}.
	 * @param ctx the parse tree
	 */
	void enterSinoSentence(SLLanguageParser.SinoSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#sinoSentence}.
	 * @param ctx the parse tree
	 */
	void exitSinoSentence(SLLanguageParser.SinoSentenceContext ctx);
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
	 * Enter a parse tree produced by {@link SLLanguageParser#doWhileSentence}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileSentence(SLLanguageParser.DoWhileSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#doWhileSentence}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileSentence(SLLanguageParser.DoWhileSentenceContext ctx);
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
	 * Enter a parse tree produced by {@link SLLanguageParser#printSentence}.
	 * @param ctx the parse tree
	 */
	void enterPrintSentence(SLLanguageParser.PrintSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#printSentence}.
	 * @param ctx the parse tree
	 */
	void exitPrintSentence(SLLanguageParser.PrintSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#readSentence}.
	 * @param ctx the parse tree
	 */
	void enterReadSentence(SLLanguageParser.ReadSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#readSentence}.
	 * @param ctx the parse tree
	 */
	void exitReadSentence(SLLanguageParser.ReadSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#switchSentence}.
	 * @param ctx the parse tree
	 */
	void enterSwitchSentence(SLLanguageParser.SwitchSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#switchSentence}.
	 * @param ctx the parse tree
	 */
	void exitSwitchSentence(SLLanguageParser.SwitchSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#caseSentence}.
	 * @param ctx the parse tree
	 */
	void enterCaseSentence(SLLanguageParser.CaseSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#caseSentence}.
	 * @param ctx the parse tree
	 */
	void exitCaseSentence(SLLanguageParser.CaseSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#expressionBoolean}.
	 * @param ctx the parse tree
	 */
	void enterExpressionBoolean(SLLanguageParser.ExpressionBooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#expressionBoolean}.
	 * @param ctx the parse tree
	 */
	void exitExpressionBoolean(SLLanguageParser.ExpressionBooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SLLanguageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SLLanguageParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(SLLanguageParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(SLLanguageParser.ConstantContext ctx);
}