import sys

def validateInput(input):
    if isinstance(input, str):
        print "String is not a valid input"
        return False
    elif isinstance(input, float):
        print "Decimal Number is not a valid input"
        return False
    elif input == 0:
        print "0 is not a valid input"
        return False
    elif input < 0:
        print "Negative number is not a valid input"
        return False
    elif input > sys.maxint:
        print "Input is out of integer boundary"
        return False
    else:
        print "valid input"
        return True                    

validateInput("@")
validateInput(3.54)
validateInput(0)
validateInput(-1000)
validateInput(5)
validateInput(sys.maxint + 1)
validateInput(3000)
