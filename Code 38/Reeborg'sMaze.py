#Passo 1 - Virar a direita
def turn_right():
    turn_left()
    turn_left()
    turn_left()
    
def turn_back():
    turn_left()
    if front_is_clear():
        move()
    else:
        turn_left()
    
def jump():    
    turn_right()
    move()
    turn_right() 
    
#Passo 3 - Escalar    
def climb():    
    turn_right()
#Passo 4 - Automatizar
while not at_goal():
    if front_is_clear():
        move()                  
    elif wall_in_front() and not right_is_clear():
        turn_back()
        
    elif wall_in front() and right_is_clear():
        turn_right()
        
    elif wall_in_front():
        climb()
