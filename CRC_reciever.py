num1 = input("Enter the recieved string:")
num2 = input("Enter the generator string:")

rstring=[int(x) for x in str(num1)]
generator=[int(x) for x in str(num2)]
rem=[]

len1=len(rstring)
len2=len(generator)
count=len2

for k in range(0,len2):
        rem.append(rstring[k])

def check(rem,len2):
    test=[]
    for i in range(0,len2):
        test.append(0)
    if(test == rem):
         return True
    else:
        return False


for j in range(0,(len1-len2)):
    if(rem[0]==1):
        for i in range(0,len2):
            rem.append(rem[i] ^ generator[i])

        for a in range(0,len2):
            rem.pop(0)
        
        rem.pop(0)
        rem.append(rstring[count])
        print(rem)
        count+=1
    else:
        rem.pop(0)
        rem.append(rstring[count])
        print(rem)
        count+=1

if(check(rem,len2)):
     print("CORRECT MESSAGE RECIEVED")
else:
     print("ERROR!! INCORRECT MESSAGE RECIEVED")

    

   
     






