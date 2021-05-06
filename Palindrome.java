import java.io.*;
import java.util.Scanner;

class Palindrome{

	static boolean checkPalindrome(String str)
	{
	    int len = str.length();

	    for(int i = 0; i < len / 2; i++)
	    {

	        if (str.charAt(i) != str.charAt(len - i - 1))
	            return false;
	    }
	    return true;
	}
	 
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
	    String st = sc.nextLine();
	     
	    if (checkPalindrome(st) == true)
	        System.out.print("Yes, it is Palindrome");
	    else
	        System.out.print("No, it is not Palindrome");
	}
}	