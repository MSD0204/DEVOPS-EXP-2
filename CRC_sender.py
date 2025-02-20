num1 = input("Enter the dataword:")
num2 = input("Enter the generator string:")

dataword=[int(x) for x in str(num1)]
generator=[int(x) for x in str(num2)]
rem=[]

len3=len(dataword)
len2=len(generator)
len1=len(dataword)+(len2-1)
count=len2

for x in range(0,len2-1):
     dataword.append(0)
     

for k in range(0,len2):
        rem.append(dataword[k])

for j in range(0,(len1-len2)):
    if(rem[0]==1):
        for i in range(0,len2):
            rem.append(rem[i] ^ generator[i])

        for a in range(0,len2):
            rem.pop(0)
        
        rem.pop(0)
        rem.append(dataword[count])
        print(rem)
        count+=1
    else:
        rem.pop(0)
        rem.append(dataword[count])
        print(rem)
        count+=1

rem.pop(0)
for x in range(len3,len(dataword)):
     dataword[x]=rem[x-len3]

codeword = "".join([str(ele) for ele in dataword])
print(f"The final codeword to be sent is:\n"+codeword)
