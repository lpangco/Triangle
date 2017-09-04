def isValidTriangle(x,y,z):
    if x >= y + z or y >= x + z or z >= x + y:
        return False
    else:
        return True


def triangleType(x,y,z):
    if x == y == z:
        return "Equilateral triangle"
    elif x != y != z:
        return "Scalene triangle"
    else:
        return "isosceles triangle"

def validateInput(user_input):
    try:
        val = int(user_input)
        if val < 0:
            print "Integer must be positive"
            return False
    except ValueError:
        print "Input must be an integer"
        return False
    return True

print "Input 3 positive integer values"
x = raw_input("First integer: ")
if validateInput(x):
    x = int(x)
else: exit()

y = raw_input("Second integer: ")
if validateInput(y):
    y = int(y)
else: exit()

z = raw_input("Third integer: ")
if validateInput(z):
    z = int(z)
else: exit()

if isValidTriangle(x, y, z):
    print triangleType(x, y, z)
else:
    print "Not a triangle"










