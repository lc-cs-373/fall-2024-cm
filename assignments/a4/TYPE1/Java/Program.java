//Program:top//
//Program:import//
import java.util.*;

public abstract class Program extends _Start /*Program:class*/ {

    public static final String $className = "Program";
    public static Program parse(Scan scn$, Trace trace$) {
        Token t$ = scn$.cur();
        Token.Match match$ = t$.match;
        switch(match$) {
        case ADD1OP:
        case EQP:
        case ANDOP:
        case ADDOP:
        case SUB1OP:
        case GEP:
        case DOT:
        case MULOP:
        case FALSE:
        case TRUE:
        case SET:
        case LIT:
        case VAR:
        case LET:
        case LEP:
        case ZEROP:
        case IF:
        case LBRACE:
        case LETREC:
        case GTP:
        case DIVOP:
        case NEP:
        case OROP:
        case LTP:
        case NOTOP:
        case PROC:
        case SUBOP:
            return Eval.parse(scn$,trace$);
        case DECLARE:
            return Declare.parse(scn$,trace$);
        case DEFINE:
            return Define.parse(scn$,trace$);
        default:
            throw new PLCCException(
                "Parse error",
                "Program cannot begin with " + t$.errString()
            );
        }
    }

    public static Env env = Env.initEnv(); // top-level value environment
    public static TypeEnv tenv = TypeEnv.initTypeEnv(); // top-level type env

//Program//
}
