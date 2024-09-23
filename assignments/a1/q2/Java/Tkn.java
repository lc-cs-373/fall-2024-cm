//Tkn:top//
//Tkn:import//
import java.util.*;

// <tkn> ::= TKN NAME DEFINITION
public class Tkn extends _Start /*Tkn:class*/ {

    public static final String $className = "Tkn";
    public static final String $ruleString =
        "<tkn> ::= TKN NAME DEFINITION";



    public Tkn() {
//Tkn:init//

    }

    public static Tkn parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<tkn>", scn$.lno);
        scn$.match(Token.Match.TKN, trace$);
        scn$.match(Token.Match.NAME, trace$);
        scn$.match(Token.Match.DEFINITION, trace$);
        return new Tkn();
    }

//Tkn//
}
