#Read a value of floating point with two decimal places. 
#This represents a monetary value. After this, calculate the smallest possible number of notes and coins on which the value can be decomposed.
#The considered notes are of 100, 50, 20, 10, 5, 2. The possible coins are of 1, 0.50, 0.25, 0.10, 0.05 and 0.01. 
#Print the message “NOTAS:” followed by the list of notes and the message “MOEDAS:” followed by the list of coins.

N = float(input())
M = int(N)
rest = int(0)

print("NOTAS:") #   NOTAS
print("%d nota(s) de R$ 100.00 " % (M/100))
rest = (N % 100)
print("%d nota(s) de R$ 50.00 " % (rest/50))
rest = (rest % 50)
print("%d nota(s) de R$ 20.00 " % (rest/20))
rest = (rest % 20)
print("%d nota(s) de R$ 10.00 " % (rest/10))
rest = (rest % 10)
print("%d nota(s) de R$ 5.00 " % (rest/5))
rest = (rest % 5)
print("%d nota(s) de R$ 2.00 " % (rest/2))
rest = (rest % 2)
print("MOEDAS:")#    MOEDAS
print("%d moeda(s) de R$ 1.00 " % (rest/1))
rest = (rest % 1)
print("%d moeda(s) de R$ 0.50 " % (rest/0.50))
rest = (rest % 0.50)
print("%d moeda(s) de R$ 0.25 " % (rest/0.25))#25 centavos
rest = (rest % 0.25)
print("%d moeda(s) de R$ 0.10 " % (rest/0.10))
rest = (rest % 0.10)
print("%d moeda(s) de R$ 0.05 " % (rest/0.05))
rest = (rest % 0.05)
print("%d moeda(s) de R$ 0.01 " % (rest/0.01))
