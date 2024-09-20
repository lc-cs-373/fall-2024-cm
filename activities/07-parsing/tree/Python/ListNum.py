#ListNum:top#
#ListNum:import#

# <list>:ListNum ::= NUMBER <list>
class ListNum(List): #ListNum:class#

    className = "ListNum"
    ruleString = "<list>:ListNum ::= NUMBER <list>"
    list = None

    def __init__(list):
        #ListNum:init#
        self.list = list

#ListNum#
