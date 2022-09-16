# Make a program that reads a seller's name, his/her fixed salary and the sale's total made by himself/herself in the month (in money).
# Considering that this seller receives 15% over all products sold, write the final salary (total) of this seller at the end of the month ,
# with two decimal places.

SN = str(input())
SS = float(input())
TOTAL = float(input())
REM = float(SS+(TOTAL*0.15))

print("TOTAL = R$ %0.2f" % REM)
