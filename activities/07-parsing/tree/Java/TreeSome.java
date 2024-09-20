//TreeSome:top//
//TreeSome:import//
import java.util.*;

// <tree>:TreeSome ::= LPAREN SYMBOL <tree>:leftNode <tree>:rightNode RPAREN
public class TreeSome extends Tree /*TreeSome:class*/ {

    public static final String $className = "TreeSome";
    public static final String $ruleString =
        "<tree>:TreeSome ::= LPAREN SYMBOL <tree>:leftNode <tree>:rightNode RPAREN";

    public Tree leftNode;
    public Tree rightNode;

    public TreeSome(Tree leftNode, Tree rightNode) {
//TreeSome:init//
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public static TreeSome parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<tree>:TreeSome", scn$.lno);
        scn$.match(Token.Match.LPAREN, trace$);
        scn$.match(Token.Match.SYMBOL, trace$);
        Tree leftNode = Tree.parse(scn$, trace$);
        Tree rightNode = Tree.parse(scn$, trace$);
        scn$.match(Token.Match.RPAREN, trace$);
        return new TreeSome(leftNode, rightNode);
    }

//TreeSome//
}
