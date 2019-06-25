// Generated from C:/Users/Nicolas Campuzano/iCloudDrive/Universidad Nacional/Semestre IX/Progamming Languages/TranslateSL2Py/grammar\SLLanguage.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SLLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SLLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(SLLanguageParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#settings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSettings(SLLanguageParser.SettingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#assignationConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignationConst(SLLanguageParser.AssignationConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#assignationTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignationTypes(SLLanguageParser.AssignationTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#assignationVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignationVar(SLLanguageParser.AssignationVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#objeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjeto(SLLanguageParser.ObjetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(SLLanguageParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SLLanguageParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(SLLanguageParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(SLLanguageParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#ifSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfSentence(SLLanguageParser.IfSentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#repeatSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatSentence(SLLanguageParser.RepeatSentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#whileSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileSentence(SLLanguageParser.WhileSentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#printSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintSentence(SLLanguageParser.PrintSentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#readSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadSentence(SLLanguageParser.ReadSentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SLLanguageParser.ExpressionContext ctx);
}