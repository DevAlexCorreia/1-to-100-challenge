#Read two nteger values (A and B). 
#After, the program should print the message "Sao Multiplos" (are multiples) or "Nao sao Multiplos" (aren’t multiples),
#corresponding to the read values.

a = int(input())
b = int(input())

if (a%b==0)or(b%a==0):
    print("Sao Multiplos")
else:
    print("Nao sao Multiplos")
