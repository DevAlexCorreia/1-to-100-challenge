#Write an algorithm that reads two floating values (x and y), which should represent the #coordinates of a point in a plane.
# Next, determine which quadrant the point belongs, or 
#if you are at one of the Cartesian axes or the origin (x = y = 0).

#If the point is at the origin, write the message "Origem".
#If the point is at X axis write "Eixo X", else if the point is at Y axis write "Eixo Y".

x = float(input())
y = float(input())

if(x==0 and y==0):
    print("Origem")
elif(x==0):
    print("Eixo Y")
elif(y==0):
    print("Eixo X")
elif(x>0 and y>0):
    print("Q1")
elif(x<0 and y>0):
    print("Q2")
elif(x<0 and y<0):
    print("Q3")
else:
    print("Q4")
