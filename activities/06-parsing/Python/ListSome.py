#ListSome:top#
#ListSome:import#

# <nums>:ListSome ::= NUMBER <nums>
class ListSome(Nums): #ListSome:class#

    className = "ListSome"
    ruleString = "<nums>:ListSome ::= NUMBER <nums>"
    nums = None

    def __init__(nums):
        #ListSome:init#
        self.nums = nums

#ListSome#
