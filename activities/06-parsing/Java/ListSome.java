//ListSome:top//
//ListSome:import//
import java.util.*;

// <nums>:ListSome ::= NUMBER <nums>
public class ListSome extends Nums /*ListSome:class*/ {

    public static final String $className = "ListSome";
    public static final String $ruleString =
        "<nums>:ListSome ::= NUMBER <nums>";

    public Nums nums;

    public ListSome(Nums nums) {
//ListSome:init//
        this.nums = nums;
    }

    public static ListSome parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<nums>:ListSome", scn$.lno);
        scn$.match(Token.Match.NUMBER, trace$);
        Nums nums = Nums.parse(scn$, trace$);
        return new ListSome(nums);
    }

//ListSome//
}
