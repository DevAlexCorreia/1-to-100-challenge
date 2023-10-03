#Passo 1 - Virar a direita
def turn_right():
    turn_left()
    turn_left()
    turn_left()
#Passo 2 - Pular
def jump():    
    turn_right()
    move()
    turn_right()    
#Passo 3 - Escalar    
def climb():    
    turn_left()
    while wall_on_right():
        if not at_goal():
            if front_is_clear():
                move()
            elif wall_in_front():
                turn_left()
    jump()
#Passo 4 - Automatizar
while not at_goal():
    if front_is_clear():
        move()
    elif wall_in_front():
        climb()
