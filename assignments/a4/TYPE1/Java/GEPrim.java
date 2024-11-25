//GEPrim:top//
//GEPrim:import//
import java.util.*;

// <prim>:GEPrim ::= GEP
public class GEPrim extends Prim /*GEPrim:class*/ {

    public static final String $className = "GEPrim";
    public static final String $ruleString =
        "<prim>:GEPrim ::= GEP";



    public GEPrim() {
//GEPrim:init//

    }

    public static GEPrim parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<prim>:GEPrim", scn$.lno);
        scn$.match(Token.Match.GEP, trace$);
        return new GEPrim();
    }

    public String toString() {
      return ">=?";
    }
    
    public Val apply(Val [] va) {
      int i0 = va[0].intVal().val;
      int i1 = va[1].intVal().val;
      return new BoolVal(i0 >= i1);
    }
    
    public ProcType definedType() {
      return Type.ii_b;
    }

//GEPrim//
}
