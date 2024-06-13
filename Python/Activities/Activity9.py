numberList1 = list(input("Enter 1st list of numbers :").split(","))
numberList2 = list(input("Enter 2nd list of numbers :").split(","))
numberList3 =[]

for number in numberList1:
    if int(number)%2 !=0:
        numberList3.append(number)
    
for number in numberList2:
    if int(number)%2 ==0:
        numberList3.append(number)

print("the final ist : ")
for number in numberList3:
    print(number)
    