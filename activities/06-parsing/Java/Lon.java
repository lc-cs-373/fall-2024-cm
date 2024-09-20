//Lon:top//
//Lon:import//
import java.util.*;

// <lon> ::= LBRACKET <nums> RBRACKET
public class Lon extends _Start /*Lon:class*/ {

    public static final String $className = "Lon";
    public static final String $ruleString =
        "<lon> ::= LBRACKET <nums> RBRACKET";

    public Nums nums;

    public Lon(Nums nums) {
//Lon:init//
        this.nums = nums;
    }

    public static Lon parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<lon>", scn$.lno);
        scn$.match(Token.Match.LBRACKET, trace$);
        Nums nums = Nums.parse(scn$, trace$);
        scn$.match(Token.Match.RBRACKET, trace$);
        return new Lon(nums);
    }

//Lon//
}
