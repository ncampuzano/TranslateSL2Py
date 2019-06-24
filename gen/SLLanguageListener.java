// Generated from C:/Users/Nicolas Campuzano/iCloudDrive/Universidad Nacional/Semestre IX/Progamming Languages/TranslateSL2Py/grammar\SLLanguage.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SLLanguageParser}.
 */
public interface SLLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(SLLanguageParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(SLLanguageParser.InicioContext ctx);
}