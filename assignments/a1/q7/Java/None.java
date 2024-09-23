//None:top//
//None:import//
import java.util.*;

// <internal>:None ::= 
public class None extends Internal /*None:class*/ {

    public static final String $className = "None";
    public static final String $ruleString =
        "<internal>:None ::= ";



    public None() {
//None:init//

    }

    public static None parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<internal>:None", scn$.lno);
        return new None();
    }

//None//
}
