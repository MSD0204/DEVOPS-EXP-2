import java.util.*;
class Main
{
	public static void main(String z[])
	{
		System.out.println("Name:MANAN DESAI  Div/Batch:I2-2  Roll no:I090  SAP ID:60003220279"); 
		Scanner s = new Scanner(System.in);
		int count=0;
		int i;
		char ch;
		System.out.println("Enter a string: ");
		String test = s.nextLine();
		System.out.println("Enter the character to be checked for occurence");
		char l = s.next().charAt(0);;
		for(i=0 ; i< test.length() ; i++)
		{
			ch = test.charAt(i);
			if(ch==l)
				count++;
		}
		System.out.println("Occurence of "+l+" in entered string is "+count);
	}
}	