//Silly:top//
//Silly:import//
import java.util.*;

// <silly> ::= WORD
public class Silly /*Silly:class*/ {

    public static final String $className = "Silly";
    public static final String $ruleString =
        "<silly> ::= WORD";



    public Silly() {
//Silly:init//

    }

    public static Silly parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<silly>", scn$.lno);
        scn$.match(Token.Match.WORD, trace$);
        return new Silly();
    }

//Silly//
}
