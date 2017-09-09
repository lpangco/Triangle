import sys

def isValidTriangle(x, y, z):
    '''
    return True if x, y, and z are valid numbers for triangle.
    return False any one of the parameters is greater than addition of the other two parameters
    '''
    if x >= y + z or y >= x + z or z >= x + y:
        print "Not a triangle"
        return False
    else:
        return True

def triangleType(x, y, z):
    '''
    return right type of triangle based on parameters
    '''
    if x == y and y == z and x == z:
        return "Equilateral triangle"
    elif x != y and y != z and x != z:
        return "Scalene triangle"
    else:
        return "isosceles triangle"

''' def validateInput(side):
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
    return True '''

def validateInput(input):
    '''
    This function take one paremeter to check if the paremeter is valid input
    
    return False if the input is one of following list:
        String, Decimal number, 0, Negative integer, Exceeded maximum integer value
    
    return True only if the input is a valid number
    '''
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
        print "Invalid input. Side length must be positive"
        return False
    elif input > sys.maxint:
        print "Exceed max integer value"
        return False
    else:
        print "valid input"
        return True

def main(x, y, z):
    '''
    This function takes 3 parameters
    It will print the type of triangle from the parameters
    if each parameter is valid input and three parameters can create valid triangle 
    '''
    if validateInput(x) and validateInput(y) and validateInput(z):
      if isValidTriangle(x, y, z):
        print triangleType(x, y, z)



# test cases, inputs as x, y, z
if __name__ == '__main__':
    print "======Exception A: negative numbers====="
    print "\nTest Case: negative inputs:"
    main(-2, -4, -5)
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

    print "\Test Case: One of the inputs number is decimal number"
    main(10.5, 10, 10)
    main(10, 10.5, 10)
    main(10, 10, 10.5)
    main(10.5, 10.5, 10)
    main(10.5, 10, 10.5)
    main(10, 10.5, 10.5)
    main(10.5, 10.5, 10.5)

    print "\Test Case: One of the inputs is String"
    main("A", 35, 50)
    main(50, "$", 10)
    main(40, 20, "BB")
    main("C", "D", 33)
    main(33, "@", "90")
    main("40", 31, "R")
    main("X", "Y", "Z")