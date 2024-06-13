fruit_rates = {
    "banana" : 10,
    "apple" : 20,
    "orange" : 30
}

user_fruit = input("Which fruit you need :")
if (user_fruit in fruit_rates):
    print("Yes "+user_fruit+" is available")
else:
    print("No "+user_fruit+" is not available")