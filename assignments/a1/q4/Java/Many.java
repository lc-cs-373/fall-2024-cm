//Many:top//
//Many:import//
import java.util.*;

// <many> **= THIS <rule> HAS MULTIPLE OCCURRENCES <OF> <stuff>
public class Many /*Many:class*/ {

    public static final String $className = "Many";
    public static final String $ruleString =
        "<many> **= THIS <rule> HAS MULTIPLE OCCURRENCES <OF> <stuff>";

    public List<Rule> ruleList;
    public List<Token> ofList;
    public List<Stuff> stuffList;

    public Many(List<Rule> ruleList, List<Token> ofList, List<Stuff> stuffList) {
//Many:init//
        this.ruleList = ruleList;
        this.ofList = ofList;
        this.stuffList = stuffList;
    }

    public static Many parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<many>", scn$.lno);
        List<Rule> ruleList = new ArrayList<Rule>();
        List<Token> ofList = new ArrayList<Token>();
        List<Stuff> stuffList = new ArrayList<Stuff>();
        while (true) {
            Token t$ = scn$.cur();
            Token.Match match$ = t$.match;
            switch(match$) {
            case THIS:
                scn$.match(Token.Match.THIS, trace$);
                ruleList.add(Rule.parse(scn$, trace$));
                scn$.match(Token.Match.HAS, trace$);
                scn$.match(Token.Match.MULTIPLE, trace$);
                scn$.match(Token.Match.OCCURRENCES, trace$);
                ofList.add(scn$.match(Token.Match.OF, trace$));
                stuffList.add(Stuff.parse(scn$, trace$));
                continue;
            default:
                return new Many(ruleList, ofList, stuffList);
            }
        }

    }

//Many//
}
