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
        System.out.println();
        for(int i = 0; i < amountOfTabsStartOfSentence; i++) {
            System.out.print("\t");
        }
    }

    /*@Override
    public void exitSentence(SLLanguageParser.SentenceContext ctx){
        System.out.println();
    }*/

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
        //System.out.print();
    }
    @Override
    public void exitPrintSentence(SLLanguageParser.PrintSentenceContext ctx) {
        System.out.print(")");
    }
    @Override
    public void enterIfSentence(SLLanguageParser.IfSentenceContext ctx){
        System.out.print("if ");
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

        System.out.print(ctx.ID(0).toString());
        for(int i = 1; i <= ctx.ID().size()-1; i++){
            System.out.print(ctx.ID(i).toString());
        }
        System.out.print(" = input()");

        for(int i = 0; i < ctx.ID().size()-1; i++){
            System.out.print(" , input()");
        }
    }



    @Override public void visitTerminal(TerminalNode node) {
        //System.out.println("visiting node: " + node.toString());
        String wordToPrint = node.toString();
        if(wordToPrint.equals(",")
                || wordToPrint.equals("<")
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
    }



}
