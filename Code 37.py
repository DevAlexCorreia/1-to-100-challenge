import random


def msg(msg):
	a = len(msg)+20
	print("*"*a)
	print(msg.center(a))
	print("*"*a)
	

random = random.randint(1,3)


def rock_papper_scissors():
	
	wins = 0
	losses = 0
	draws = 0
	
	while True:
		choice = input("Rock, Paper or Scissors? ").lower()
		if choice == "rock".lower():
			print("""
			    _______
			---'   ____)
			      (_____)
			      (_____)
			      (____)
			---.__(___)
			""")

			if random == 1:
				print ("""Computer plays rock:
				    _______
				---'   ____)
				      (_____)
				      (_____)
				      (____)
				---.__(___)
				""")
				msg("DRAW")
				draws+=1

			elif random == 2:
				print(""" Computer plays paper:
				     _______
				---'    ____)____
				           ______)
				          _______)
				         _______)
				---.__________)
				""")
				msg("YOU LOSE!")
				losses+=1
			else:
				print(""" Computer plays scissors
				    _______
				---'   ____)____
				          ______)
				       __________)
				      (____)
				---.__(___)
				""")
				msg("YOU WIN!")
				wins+=1

		if choice == "paper".lower():
			print("""
				     _______
				---'    ____)____
				           ______)
				          _______)
				         _______)
				---.__________)
				""")

			if random == 1:
				print ("""Computer plays rock:
				    _______
				---'   ____)
				      (_____)
				      (_____)
				      (____)
				---.__(___)
				""")
				msg("YOU WIN")
				wins+=1

			elif random == 2:
				print(""" Computer plays paper:
				     _______
				---'    ____)____
				           ______)
				          _______)
				         _______)
				---.__________)
				""")
				msg("DRAW")
				draws+=1
			else:
				print(""" Computer plays scissors
				    _______
				---'   ____)____
				          ______)
				       __________)
				      (____)
				---.__(___)
				""")
				msg("YOU LOSE!")
				losses+=1

		if choice == "scissors".lower():
			print("""
				    _______
				---'   ____)____
				          ______)
				       __________)
				      (____)
				---.__(___)
				""")

			if random == 1:
				print ("""Computer plays rock:
				    _______
				---'   ____)
				      (_____)
				      (_____)
				      (____)
				---.__(___)
				""")
				msg("YOU LOSE!")
				losses+=1

			elif random == 2:
				print(""" Computer plays paper:
				     _______
				---'    ____)____
				           ______)
				          _______)
				         _______)
				---.__________)
				""")
				msg("YOU WIN")
				wins+=1
			else:
				print(""" Computer plays scissors
				    _______
				---'   ____)____
				          ______)
				       __________)
				      (____)
				---.__(___)
				""")
				msg("DRAW")
				draws+=1
		play_again = input("Do you want to play again ?").lower()

		if play_again != 'yes':
			break
	print(f"Wins = {wins}\nLosses = {losses}\nDraws = {draws}")


rock_papper_scissors()
