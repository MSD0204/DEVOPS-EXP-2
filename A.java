import java.util.*;
import java.io.*;
class Main
{
	public static void main(String z[])
	{
		System.out.println("Name:MANAN DESAI  Div/Batch:I2-2  Roll no:I090  SAP ID:60003220279"); 
		Scanner s = new Scanner(System.in);
		int upper=0,lower=0,number=0,special=0,blank=0;
		int i=0;
		System.out.println("Enter a string");
		String test = s.nextLine();
		for(i=0 ; i< test.length() ; i++)
		{
			char ch = test.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
                		upper++;
            		else if (ch >= 'a' && ch <= 'z')
                		lower++;
           		else if (ch >= '0' && ch <= '9')
               	 		number++;
            		else if( ch == ' ')
				blank++;
			else
                		special++;
		}
		System.out.println("Lower case letters : " + lower);
        	System.out.println("Upper case letters : " + upper);
        	System.out.println("Number : " + number);
		System.out.println("Blank Spaces: "+blank);
        	System.out.println("Special characters : " + special);
	}
}	
		