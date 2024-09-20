#TreeSome:top#
#TreeSome:import#

# <tree>:TreeSome ::= LPAREN SYMBOL <tree>:leftNode <tree>:rightNode RPAREN
class TreeSome(Tree): #TreeSome:class#

    className = "TreeSome"
    ruleString = "<tree>:TreeSome ::= LPAREN SYMBOL <tree>:leftNode <tree>:rightNode RPAREN"
    leftNode = None
    rightNode = None

    def __init__(leftNode, rightNode):
        #TreeSome:init#
        self.leftNode = leftNode
        self.rightNode = rightNode

#TreeSome#
