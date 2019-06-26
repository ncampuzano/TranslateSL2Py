import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class ListenerSLToPy extends SLLanguageBaseListener {
    public int amountOfTabsStartOfSentence = 0;

    @Override
    public void enterAssignationConst(SLLanguageParser.AssignationConstContext ctx){
        String value = ctx.id(0).ID().toString(); //Get the string of IDs
        System.out.print(value + " = " + translationOfExpression(ctx.expression(0)));
    }
    @Override
    public void exitAssignationConst(SLLanguageParser.AssignationConstContext ctx) {
        System.out.println();
    }
    @Override
    public void enterSentence(SLLanguageParser.SentenceContext ctx){
        System.out.println();
        for(int i = 0; i < amountOfTabsStartOfSentence; i++) {
            System.out.print("\t");
        }
    }

    @Override
    public void enterAssignationVar(SLLanguageParser.AssignationVarContext ctx) {
        System.out.print(ctx.id(0).ID().toString());
        for(int i = 1; i < ctx.id().size(); i++){
            System.out.print(", " + ctx.id(i).ID().toString());
        }
        System.out.print(" = " + translateTipo(ctx.tipo()));
        System.out.println();
    }
    public String translateTipo(SLLanguageParser.TipoContext ctx) {
        String tipo = "";
        if (ctx.VECTOR() != null) {
            if (ctx.tipoVector().expression() != null) {
                tipo += '[';
                tipo += translationOfExpression(ctx.tipoVector().expression());
                tipo += ']';
            } else {
                tipo = "[]";
            }
        }
        if (ctx.MATRIZ() != null) {
            tipo = "[[]]";
        }
        if (ctx.NUMERICO() != null) {
            tipo = "0";
        }
        if (ctx.CADENATIPO() != null) {
            tipo = "\"\"";
        }
        if (ctx.LOGICO() != null) {
            tipo = "TRUE";
        }
        if (ctx.ID() != null) {
            tipo = ctx.ID().toString();
        }
        return tipo;
    }

    /*@Override
    public void exitSentence(SLLanguageParser.SentenceContext ctx){
        System.out.println();
    }*/

    @Override
    public void enterPrintSentence(SLLanguageParser.PrintSentenceContext ctx) {
        String expr = translationOfExpression(ctx.expression(0));
        System.out.print("print(str(" +  expr);
        for(int i = 1; i <= ctx.expression().size()-1;i++){
            expr = translationOfExpression(ctx.expression(i));
            System.out.print(") , str( " + expr);
        }
    }

    public String translationOfExpression(SLLanguageParser.ExpressionContext ctx){
        String expr = "";
        if(ctx.constant()!= null) {
            if (ctx.constant().NUM() != null) {
                expr = ctx.constant().NUM().toString();
            } else if (ctx.constant().CADENA() != null) {
                expr = ctx.constant().CADENA().toString();
            } else if (ctx.constant().BOOL() != null) {
                expr = ctx.constant().BOOL().toString();
            } else if (ctx.constant().DOUBLE() != null) {
                expr = ctx.constant().DOUBLE().toString();
            } else if (ctx.constant().id() != null && ctx.constant().id().ID() != null) {
                expr += ctx.constant().id().ID().toString();
                if(ctx.constant().id().functionParameters()!= null){
                    expr += "(";
                    if(ctx.constant().id().functionParameters().expression()!= null) {
                        expr += translationOfExpression(ctx.constant().id().functionParameters().expression(0));
                        for (int i = 1; i < ctx.constant().id().functionParameters().expression().size(); i++) {
                            expr += ",";
                            expr += translationOfExpression(ctx.constant().id().functionParameters().expression(i));
                        }
                    }
                    expr += ")";
                }
                if(ctx.constant().id().vector()!= null){
                    expr += "[";
                    expr += translationOfExpression(ctx.constant().id().vector().expression(0));
                    expr += "]";
                }
            }
        }
        else if(ctx.callToFunctionSentence() != null){
            expr += ctx.callToFunctionSentence().id().ID().toString();
            expr += "(";
            if(ctx.callToFunctionSentence().functionParameters().expression()!= null) {
                expr += ctx.callToFunctionSentence().functionParameters().expression(0).toString();
                for (int i = 1; i < ctx.callToFunctionSentence().functionParameters().expression().size(); i++) {
                    expr += ",";
                    expr += ctx.callToFunctionSentence().functionParameters().expression(i).toString();
                }
            }
            expr += ")";
        }

        else if(ctx.e1 != null ){
            if(ctx.PIZQ()!= null){
                expr += "(";
                expr += translationOfExpression(ctx.e1);
                expr += ")";
            }
            else if(ctx.e2 != null){
                expr += translationOfExpression(ctx.e1);
                expr += " ";
                expr += ctx.OPERADOR().toString();
                expr += " ";
                expr += translationOfExpression(ctx.e2);
            }
        }
        else if (ctx.OPERADOR()!= null){
            expr += ctx.OPERADOR().toString();
            expr += translationOfExpression(ctx.expression(0));
        }
        return expr;
    }
    public String translationOfExpressionBoolean(SLLanguageParser.ExpressionBooleanContext ctx){
        String expr = "";
        expr += translationOfExpression(ctx.expression());
        if(ctx.ROP()!= null){
            expr += " ";
            expr += ctx.ROP().toString();
            expr += " ";
            expr += translationOfExpression(ctx.expressionBoolean().expression());
        }
        return expr;
    }
    @Override
    public void exitPrintSentence(SLLanguageParser.PrintSentenceContext ctx) {
        System.out.print("))");
    }
    @Override
    public void enterIfSentence(SLLanguageParser.IfSentenceContext ctx){
        System.out.print("if ");
    }
    @Override
    public void enterExpressionBoolean(SLLanguageParser.ExpressionBooleanContext ctx) {
        System.out.print(translationOfExpression(ctx.expression()));
    }
    @Override public void enterBodyIfSentence(SLLanguageParser.BodyIfSentenceContext ctx) {
        System.out.print(":");
        amountOfTabsStartOfSentence++;
    }
    @Override public void exitBodyIfSentence(SLLanguageParser.BodyIfSentenceContext ctx) {
        amountOfTabsStartOfSentence--;
    }
    @Override public void enterSinoSentence(SLLanguageParser.SinoSentenceContext ctx) {
        System.out.println();
        amountOfTabsStartOfSentence--;
        for (int i = 0; i < amountOfTabsStartOfSentence; i++) {
            System.out.print("\t");
        }
        if(ctx.ifSentence()!=null) {
            System.out.print("el");
        }
        else{
            System.out.print("else");
        }
        amountOfTabsStartOfSentence++;
    }
    @Override public void exitReadSentence(SLLanguageParser.ReadSentenceContext ctx) {

        System.out.print(ctx.id(0).ID().toString());
        for(int i = 1; i <= ctx.id().size()-1; i++){
            System.out.print(" , " + ctx.id(i).ID().toString());
        }
        System.out.print(" = input()");

        for(int i = 0; i < ctx.id().size()-1; i++){
            System.out.print(" , input()");
        }
    }
    @Override public void enterAssignationSentence(SLLanguageParser.AssignationSentenceContext ctx) {
        String id = ctx.id().ID().toString();
        String expr = translationOfExpression(ctx.expression());
        System.out.print(id + " = " + expr);
    }

    @Override
    public void enterRepeatSentence(SLLanguageParser.RepeatSentenceContext ctx) {
        System.out.print("for "
                +  ctx.id().getText()
                + " in range(int("
                + translationOfExpression(ctx.expression(0))
                + "), int("
                + translationOfExpression(ctx.expression(1))
                + ")+1");
        if(ctx.PASO()!= null){
            System.out.print(", int(" + translationOfExpression(ctx.expression(2))+")");
        }
        System.out.print("):");
        amountOfTabsStartOfSentence++;
    }

    @Override
    public void exitRepeatSentence(SLLanguageParser.RepeatSentenceContext ctx) {
        amountOfTabsStartOfSentence--;
    }
    @Override
    public void enterSwitchSentence(SLLanguageParser.SwitchSentenceContext ctx){
        amountOfTabsStartOfSentence++;
    }

    @Override
    public void exitSwitchSentence(SLLanguageParser.SwitchSentenceContext ctx){
        amountOfTabsStartOfSentence--;
    }

    @Override
    public void enterCaseSentence(SLLanguageParser.CaseSentenceContext ctx) {
        System.out.print("if "
                + translationOfExpressionBoolean(ctx.expressionBoolean())
                + ":");

    }
    @Override
    public void exitCaseSentence(SLLanguageParser.CaseSentenceContext ctx) {

        System.out.println();
        System.out.print("el");
        //System.out.print("if ");
    }
    public void enterDefaultSentence(SLLanguageParser.DefaultSentenceContext ctx) {
        System.out.print("se");

    }





/*    @Override public void visitTerminal(TerminalNode node) {
        //System.out.println("visiting node: " + node.toString());
        String wordToPrint = node.toString();
        if( wordToPrint.equals("<")
                || wordToPrint.equals(">")
                || wordToPrint.equals(">=")
                || wordToPrint.equals("<=")
                || wordToPrint.equals("==")
                || wordToPrint.equals("*")
                || wordToPrint.equals("/")
                || wordToPrint.equals("+")
                || wordToPrint.equals("-")
                || wordToPrint.equals("%")
                || wordToPrint.equals("^")
        ){
            System.out.print(wordToPrint);
        }
        if(wordToPrint.equals("and")
                || wordToPrint.equals("or")
                || wordToPrint.equals("TRUE")
                || wordToPrint.equals("FALSE")){
            System.out.print(" "+wordToPrint + " ");

        }
    }*/



}
