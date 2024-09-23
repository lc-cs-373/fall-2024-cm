//Balanced:top//
//Balanced:import//
import java.util.*;

// <balanced> ::= LP <internal> RP AT
public class Balanced /*Balanced:class*/ {

    public static final String $className = "Balanced";
    public static final String $ruleString =
        "<balanced> ::= LP <internal> RP AT";

    public Internal internal;

    public Balanced(Internal internal) {
//Balanced:init//
        this.internal = internal;
    }

    public static Balanced parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<balanced>", scn$.lno);
        scn$.match(Token.Match.LP, trace$);
        Internal internal = Internal.parse(scn$, trace$);
        scn$.match(Token.Match.RP, trace$);
        scn$.match(Token.Match.AT, trace$);
        return new Balanced(internal);
    }

//Balanced//
}
