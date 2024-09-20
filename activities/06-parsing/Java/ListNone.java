//ListNone:top//
//ListNone:import//
import java.util.*;

// <nums>:ListNone ::= 
public class ListNone extends Nums /*ListNone:class*/ {

    public static final String $className = "ListNone";
    public static final String $ruleString =
        "<nums>:ListNone ::= ";



    public ListNone() {
//ListNone:init//

    }

    public static ListNone parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<nums>:ListNone", scn$.lno);
        return new ListNone();
    }

//ListNone//
}
