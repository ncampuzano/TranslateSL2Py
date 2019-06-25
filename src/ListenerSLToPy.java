public class ListenerSLToPy extends SLLanguageBaseListener {
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
        System.out.println(")");
    }


}
