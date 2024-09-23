//Classes:top//
//Classes:import//
import java.util.*;

// <classes> ::= I AM TAKING <CSIT>c1 <CSIT>c2 AND <CSIT>c3
public class Classes extends _Start /*Classes:class*/ {

    public static final String $className = "Classes";
    public static final String $ruleString =
        "<classes> ::= I AM TAKING <CSIT>c1 <CSIT>c2 AND <CSIT>c3";

    public Token c1;
    public Token c2;
    public Token c3;

    public Classes(Token c1, Token c2, Token c3) {
//Classes:init//
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    public static Classes parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<classes>", scn$.lno);
        scn$.match(Token.Match.I, trace$);
        scn$.match(Token.Match.AM, trace$);
        scn$.match(Token.Match.TAKING, trace$);
        Token c1 = scn$.match(Token.Match.CSIT, trace$);
        Token c2 = scn$.match(Token.Match.CSIT, trace$);
        scn$.match(Token.Match.AND, trace$);
        Token c3 = scn$.match(Token.Match.CSIT, trace$);
        return new Classes(c1, c2, c3);
    }

//Classes//
}
