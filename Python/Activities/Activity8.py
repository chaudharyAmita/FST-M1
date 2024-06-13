numbers = list(input("Enter numbers in a list :").split(","))
sum = 0
for number in numbers:
    sum = sum+int(number)

print("Total is "f"{sum}")