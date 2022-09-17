# Read 3 floating-point numbers. After, print the roots of bhaskara’s formula. 
# If it's impossible to calculate the roots because a division by zero or a square root of a negative number,
# presents the message “Impossivel calcular”.

import math
A = float(input())
B = float(input())
C = float(input())

delta = ((B * B) - (4 * A * C))

if A > 0 and delta > 0:
    root = delta ** (1 / 2)
    R1 = (-B + root) / (2 * A)
    R2 = (-B - root) / (2 * A)
    print("R1 = %0.5f" % R1)
    print("R2 = %0.5f" % R2)


else:
    print("Impossivel Calcular")
