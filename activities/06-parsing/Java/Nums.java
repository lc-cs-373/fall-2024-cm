//Nums:top//
//Nums:import//
import java.util.*;

public abstract class Nums /*Nums:class*/ {

    public static final String $className = "Nums";
    public static Nums parse(Scan scn$, Trace trace$) {
        Token t$ = scn$.cur();
        Token.Match match$ = t$.match;
        switch(match$) {
        case NUMBER:
            return ListSome.parse(scn$,trace$);
        case RBRACKET:
            return ListNone.parse(scn$,trace$);
        default:
            throw new PLCCException(
                "Parse error",
                "Nums cannot begin with " + t$.errString()
            );
        }
    }

//Nums//
}
