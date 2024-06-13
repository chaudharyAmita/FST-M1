numbers = list(input("Enter numbers in a list :").split(","))
firstNumber = numbers[0]
lastNumber = numbers[-1]

if(firstNumber == lastNumber):
    print("True")
else:
    print("False")