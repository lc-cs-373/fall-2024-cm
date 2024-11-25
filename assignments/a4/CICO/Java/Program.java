//Program:top//
//Program:import//
import java.util.*;

public abstract class Program extends _Start /*Program:class*/ {

    public static final String $className = "Program";
    public static Program parse(Scan scn$, Trace trace$) {
        Token t$ = scn$.cur();
        Token.Match match$ = t$.match;
        switch(match$) {
        case DEFINE:
            return Define.parse(scn$,trace$);
        case LETREC:
        case MULOP:
        case ZEROP:
        case LET:
        case ADD1OP:
        case SUB1OP:
        case SET:
        case DIVOP:
        case LBRACE:
        case SUBOP:
        case LIT:
        case DOT:
        case PROC:
        case VAR:
        case IF:
        case ADDOP:
            return Eval.parse(scn$,trace$);
        default:
            throw new PLCCException(
                "Parse error",
                "Program cannot begin with " + t$.errString()
            );
        }
    }

    public static Env env = Env.initEnv(); // the initial environment

//Program//
}
