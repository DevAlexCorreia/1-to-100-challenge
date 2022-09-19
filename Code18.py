#Read the start time and end time of a game, in hours. Then calculate the duration of the game
#knowing that the game can begin in a day and finish in another day
#with a maximum duration of 24 hours. The message must be printed in portuguese
#“O JOGO DUROU X HORA(S)” that means “THE GAME LASTED X HOUR(S)”

start = int(input())
end = int(input())


if(start<end):
    h = end-start  
else:
    h=24-start+end
    
print("O JOGO DUROU %d HORA(S)" % h)
