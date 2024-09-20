#Lon:top#
#Lon:import#

# <lon> ::= LBRACKET <nums> RBRACKET
class Lon(_Start): #Lon:class#

    className = "Lon"
    ruleString = "<lon> ::= LBRACKET <nums> RBRACKET"
    nums = None

    def __init__(nums):
        #Lon:init#
        self.nums = nums

#Lon#
