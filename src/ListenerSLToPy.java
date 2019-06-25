import org.antlr.v4.runtime.tree.TerminalNode;

public class ListenerSLToPy extends SLLanguageBaseListener {
    public int amountOfTabsStartOfSentence = 0;

    @Override
    public void enterAssignationConst(SLLanguageParser.AssignationConstContext ctx){
        String value = ctx.ID().toString(); //Get the string of IDs
        value = value.replace(","," ="); //Make it one big assignation
        value = value.substring(1,value.length()-1); //Remove first and last characters [ ]
        System.out.print(value + " = ");
    }
    @Override
    public void exitAssignationConst(SLLanguageParser.AssignationConstContext ctx) {
        System.out.println();
    }
    @Override
    public void enterSentence(SLLanguageParser.SentenceContext ctx){
        for(int i = 0; i < amountOfTabsStartOfSentence; i++) {
            System.out.print("\t");
        }
    }

    @Override
    public void exitSentence(SLLanguageParser.SentenceContext ctx){
        System.out.println();
    }

    @Override
    public void enterConstant(SLLanguageParser.ConstantContext ctx) {
        String expr = "";
        if(ctx.NUM()!= null) {
            expr = ctx.NUM().toString();
        }
        if(ctx.CADENA()!= null) {
            expr = ctx.CADENA().toString();
        }
        if(ctx.BOOL()!= null) {
            expr = ctx.BOOL().toString();
        }
        if(ctx.DOUBLE()!= null) {
            expr = ctx.DOUBLE().toString();
        }
        if(ctx.ID()!= null) {
            expr = ctx.ID().toString();
        }
        System.out.print(expr);
    }
    @Override
    public void enterPrintSentence(SLLanguageParser.PrintSentenceContext ctx) {
        System.out.print("print(");
    }
    @Override
    public void exitPrintSentence(SLLanguageParser.PrintSentenceContext ctx) {
        System.out.print(")");
    }
    @Override public void visitTerminal(TerminalNode node) {
        //System.out.println("visiting node: " + node.toString());
        if(node.toString().equals(",")){
            System.out.print(node.toString());
        }
    }



}
