import sys

def isValidTriangle(x,y,z):
    if x >= y + z or y >= x + z or z >= x + y:
        print "Not a triangle"
        return False
    else:
        return True
def triangleType(x,y,z):
    if x == y and y == z and x == z:
        return "Equilateral triangle"
    elif x != y and y != z and x != z:
        return "Scalene triangle"
    else:
        return "isosceles triangle"

def validateInput(side):
    try:
        if side%1 != 0:
            print "input number is not a integer"
            return False
        val = int(side)
        if val < 0:
            print "Invalid input. Side length must be positive"
            return False
        elif val > sys.maxint:
            print "Exceed max integer value"
            return False

    except ValueError:
        print "Input must be an integer"
        return False
    return True

''' def validateInput(input):
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
        return True '''

def main(x, y, z):
    if validateInput(x) and validateInput(y) and validateInput(z):
        x = int(x)
        y = int(y)
        z = int(z)
        if isValidTriangle(x, y, z):
            print triangleType(x, y, z)



# test cases, inputs as x, y, z
if __name__ == '__main__':
    print "======Exception A: negative numbers====="
    print "\nTest Case: negative inputs:"
    main(-2,-4,-5)
    main(-3, 5, 5)
    main(3, -1, 2)
    main(7, 12, -9)
    main(-3, -1, 8)
    main(-4, 4, 4)
    main(2, -6, -8)

    print "\nTest Case: Isosceles:"
    main(2, 3, 3)
    main(5, 5, 7)
    main(9, 8, 9)

    print "\nTest Case: Equilateral triangle:"
    main(10, 10, 10)
    main(24, 24, 24)
    main(3, 3, 3)

    print "\nTest Case: Scalene Triangle:"
    main(2, 3, 4)
    main(7, 11, 9)
    main(15, 12, 14)

    print "\nTest Case: exceed max integers"
    main(sys.maxint+1, sys.maxint+1, sys.maxint+1)
    main(sys.maxint+1, 10, 20)
    main(8, sys.maxint+1, 16)
    main(20, 40, sys.maxint+1)
    main(sys.maxint+1, sys.maxint+1, 25)
    main(sys.maxint+1, 30, sys.maxint+1)
    main(100, sys.maxint+1, sys.maxint+1)

    print "\nTest Case: including zeros"
    main(0, 0, 0)
    main(0, 4, 5)
    main(6, 0, 7)
    main(6, 5, 0)
    main(0, 0, 8)
    main(0, 4, 0)
    main(9, 0, 0)

    print "\nTest Case: Not Triangle"
    print "\nTest Case: x > y + z"
    main(100, 30, 50)
    print "\nTest Case: x = y + z"
    main(80, 30, 50)
    print "\nTest Case: y > x + z"
    main(29, 80, 45)
    print "\nTest Case: y = x + z"
    main(35, 70, 35)
    print "\nTest Case: z > x + y"
    main(25, 15, 110)
    print "\nTest Case: z = y + z"
    main(10, 40, 50)


