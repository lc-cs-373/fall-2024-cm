//Internal:top//
//Internal:import//
import java.util.*;

public abstract class Internal extends _Start /*Internal:class*/ {

    public static final String $className = "Internal";
    public static Internal parse(Scan scn$, Trace trace$) {
        Token t$ = scn$.cur();
        Token.Match match$ = t$.match;
        switch(match$) {
        case RP:
            return None.parse(scn$,trace$);
        case LP:
            return Some.parse(scn$,trace$);
        default:
            throw new PLCCException(
                "Parse error",
                "Internal cannot begin with " + t$.errString()
            );
        }
    }

//Internal//
}
