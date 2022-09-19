#Read 3 double numbers (A, B and C) representing the sides of a triangle and arrange
#them in decreasing order, so that the side A is the biggest of the three sides. Next,
#determine the type of triangle that they can make, based on the following cases always
#writing an appropriate message:

•	#if A ≥ B + C, write the message: NAO FORMA TRIANGULO
•	#If A2 = B2 + C2, write the message: TRIANGULO RETANGULO
•	#if A2 > B2 + C2, write the message: TRIANGULO OBTUSANGULO
•	#if A2 < B2 + C2, write the message: TRIANGULO ACUTANGULO
•	#if the three sides are the same size, write the message: TRIANGULO #EQUILATERO
•	#if only two sides are the same and the third one is different, write the #message: TRIANGULO ISOSCELES


a,b,c=list(map(float,input().split()))
if(a < b):
    temp = a
    a = b
    b = temp
if(b < c):
    temp = b
    b = c
    c = temp
if(a < b):
    temp = a
    a = b
    b = temp
if(a>=(b+c)):
    print("NAO FORMA TRIANGULO")
elif(a*a == (b*b+c*c)):
     print("TRIANGULO RETANGULO")
elif(a * a > (b*b+ c*c)):
    print("TRIANGULO OBTUSANGULO")
elif(a*a<(b*b + c*c)):
    print("TRIANGULO ACUTANGULO")
if(a == b and b == c):
        print("TRIANGULO EQUILATERO")
elif(a == b or b == c):
        print("TRIANGULO ISOSCELES")
