//Stuff:top//
//Stuff:import//
import java.util.*;

// <stuff> ::= STUFF
public class Stuff /*Stuff:class*/ {

    public static final String $className = "Stuff";
    public static final String $ruleString =
        "<stuff> ::= STUFF";



    public Stuff() {
//Stuff:init//

    }

    public static Stuff parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<stuff>", scn$.lno);
        scn$.match(Token.Match.STUFF, trace$);
        return new Stuff();
    }

//Stuff//
}
