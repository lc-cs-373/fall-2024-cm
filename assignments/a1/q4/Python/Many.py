#Many:top#
#Many:import#

# <many> **= THIS <rule> HAS MULTIPLE OCCURRENCES <OF> <stuff>
class Many(): #Many:class#

    className = "Many"
    ruleString = "<many> **= THIS <rule> HAS MULTIPLE OCCURRENCES <OF> <stuff>"
    ruleList = None
    ofList = None
    stuffList = None

    def __init__(ruleList, ofList, stuffList):
        #Many:init#
        self.ruleList = ruleList
        self.ofList = ofList
        self.stuffList = stuffList

#Many#
