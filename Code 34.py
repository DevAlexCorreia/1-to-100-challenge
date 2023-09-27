def msg(msg):
        b = len(msg)+20
        print("-"*b)
        print(msg.center(b))
        print("-"*b)


def paytoenter(age,height):
    

    ticket = 0
    stats = ""
    ride = ""
    bill = 0
    if height >= 120:
        ride = "you can go"
        if age <12:
            ticket = 5
            stats = "a child"
        elif age >=12 and age<18:
            ticket = 7
            stats = "a teenager"
        elif age >= 18:
            ticket = 12
            stats = "an adult"  
        msg(f"Pay ${ticket} for the ticket because you're {stats}")

        photo = input("Do you want a photo or not? ")
        if photo == "yes" or photo == "Yes" or photo == "YES":

            bill = ticket+3
            msg(f"The total bill is ${bill}")
        else:
            bill = ticket
            msg(f"Enjoy your ride, the total bill is ${bill}")
    else:
        ride = "you can't go"
        msg(f"{ride} to a ride cause your height is less then 120cm")
    


# person 1 - Adult
h1 = 190
a1 = 20

#person 2 - kid
h2 = 120
a2 = 9

#person 3 - teenager
h3 = 165
a3 = 17

paytoenter(a1,h1)
paytoenter(a2,h2)
paytoenter(a3,h3)
