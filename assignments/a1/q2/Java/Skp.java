//Skp:top//
//Skp:import//
import java.util.*;

// <skp> ::= SKP NAME DEFINITION
public class Skp /*Skp:class*/ {

    public static final String $className = "Skp";
    public static final String $ruleString =
        "<skp> ::= SKP NAME DEFINITION";



    public Skp() {
//Skp:init//

    }

    public static Skp parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<skp>", scn$.lno);
        scn$.match(Token.Match.SKP, trace$);
        scn$.match(Token.Match.NAME, trace$);
        scn$.match(Token.Match.DEFINITION, trace$);
        return new Skp();
    }

//Skp//
}
