#ListSymb:top#
#ListSymb:import#

# <list>:ListSymb ::= SYMBOL <list>
class ListSymb(List): #ListSymb:class#

    className = "ListSymb"
    ruleString = "<list>:ListSymb ::= SYMBOL <list>"
    list = None

    def __init__(list):
        #ListSymb:init#
        self.list = list

#ListSymb#
