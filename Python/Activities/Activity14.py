def fibonnaci(num):
    if num<=1:
        return num
    else:
        return(fibonnaci(num-1)+fibonnaci(num-2))


count = int(input("How many numbers of a fibonnaci series to be generated: "))
if count<=0:
    print("Enter positive number")
else:
    for i in range(count):
        print(fibonnaci(i))
