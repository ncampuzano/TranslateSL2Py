public class ListenerSLToPy extends SLLanguageBaseListener {
    @Override
    public void enterAssignationConst(SLLanguageParser.AssignationConstContext ctx){
        String value = ctx.ID().toString(); //Get the string of IDs
        value = value.replace(","," ="); //Make it one big assignation
        value = value.substring(1,value.length()-1); //Remove first and last characters [ ]
        // String expr = ctx.expr(0).NUM().toString();
        // System.out.println(value + " = " + expr);
    }



}
