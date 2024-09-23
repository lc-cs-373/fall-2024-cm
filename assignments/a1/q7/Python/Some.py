#Some:top#
#Some:import#

# <internal>:Some ::= LP <internal> RP
class Some(Internal): #Some:class#

    className = "Some"
    ruleString = "<internal>:Some ::= LP <internal> RP"
    internal = None

    def __init__(internal):
        #Some:init#
        self.internal = internal

#Some#
