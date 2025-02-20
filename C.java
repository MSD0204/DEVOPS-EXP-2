import java.util.*;
class Palindrome
{
	public static void main(String z[])
	{
		System.out.println("Name:MANAN DESAI  Div/Batch:I2-2  Roll no:I090  SAP ID:60003220279"); 
		Scanner s = new Scanner(System.in);
		String in,rev;
		System.out.println("Enter a string");
		in = s.nextLine();
		StringBuffer sb = new StringBuffer();
		sb.append(in);
		sb.reverse();
		rev=sb.toString();
		if((in.equals(rev)))
			System.out.println("This is a palindrome");
		else
			System.out.println("This is not a palindrome");

	}
}	