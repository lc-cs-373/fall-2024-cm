#ListList:top#
#ListList:import#

# <list>:ListList ::= <tree>
class ListList(List): #ListList:class#

    className = "ListList"
    ruleString = "<list>:ListList ::= <tree>"
    tree = None

    def __init__(tree):
        #ListList:init#
        self.tree = tree

#ListList#
