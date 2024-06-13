user1 = input("Player1 Name : ")
user2 = input("Player2 Name : ")

user1Choice = input("Hi "+user1+" , Choose Rock, Paper or scissor :").lower()
user2Choice = input("Hi "+user2+" , Choose Rock, Paper or scissor :").lower()

if(user1Choice == user2Choice):
    print("It is a Tie")
elif(user1Choice == 'rock'):
    if (user2Choice == 'paper'):
        print(user2+" wins")
    else:
        print(user1+" wins")
elif(user1Choice == 'paper'):
    if (user2Choice == 'scissor'):
        print(user2+" wins")
    else:
        print(user1+" wins")
elif(user1Choice == 'scissor'):
    if (user2Choice == 'rock'):
        print(user2+" wins")
    else:
        print(user1+" wins")
else:
    print("Invalid Choice. Please try again")
      