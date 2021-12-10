package Democlass2;

import java.util.Scanner;

//Write a method that takes a String as a parameter and returns true if String is palindrome else return false.  ( A string is a palindrome if it is same as its reverse. Eg. mom, refer).

public class Assign2Polindrome
{
	public static boolean polindrome(String str)
	{
	 
		String revs="";int i;
		
		for( i=(str.length())-1;i>=0;i--)
		{
			char st=str.charAt(i);
			revs=revs+st;
		}
		System.out.println("Reverse String"+revs);
		if(str.equals(revs))
			return true;
		else 
			return false;
	}

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string");
		String name=input.nextLine();
		
		boolean p=polindrome(name);
		System.out.println(name+ "  is Polidrome  "+ p);
		input.close();
	}

}
