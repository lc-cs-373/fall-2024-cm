//Silly:top//
//Silly:import//
import java.util.*;

// <silly> ::= WORDTWO
public class Silly extends _Start /*Silly:class*/ {

    public static final String $className = "Silly";
    public static final String $ruleString =
        "<silly> ::= WORDTWO";



    public Silly() {
//Silly:init//

    }

    public static Silly parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<silly>", scn$.lno);
        scn$.match(Token.Match.WORDTWO, trace$);
        return new Silly();
    }

//Silly//
}
