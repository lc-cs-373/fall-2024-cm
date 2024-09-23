//Rule:top//
//Rule:import//
import java.util.*;

// <rule> ::= BLUH
public class Rule extends _Start /*Rule:class*/ {

    public static final String $className = "Rule";
    public static final String $ruleString =
        "<rule> ::= BLUH";



    public Rule() {
//Rule:init//

    }

    public static Rule parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<rule>", scn$.lno);
        scn$.match(Token.Match.BLUH, trace$);
        return new Rule();
    }

//Rule//
}
