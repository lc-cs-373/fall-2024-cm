//Some:top//
//Some:import//
import java.util.*;

// <internal>:Some ::= LP <internal> RP
public class Some extends Internal /*Some:class*/ {

    public static final String $className = "Some";
    public static final String $ruleString =
        "<internal>:Some ::= LP <internal> RP";

    public Internal internal;

    public Some(Internal internal) {
//Some:init//
        this.internal = internal;
    }

    public static Some parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<internal>:Some", scn$.lno);
        scn$.match(Token.Match.LP, trace$);
        Internal internal = Internal.parse(scn$, trace$);
        scn$.match(Token.Match.RP, trace$);
        return new Some(internal);
    }

//Some//
}
