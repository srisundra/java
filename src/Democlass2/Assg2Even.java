package Democlass2;

import java.util.Scanner;

//Write a method that returns true if a number passed to it is even else it returns false
public class Assg2Even {
	public static boolean even(int a)
	{
		
	boolean even = (a>0 && (a%2 ==	0)) ?  true : false;
	if(even)
	{
		System.out.println("Number is even"); 
	return even;
	}
	else
	{
		System.out.println("Number is odd");
	return even;
	}
	}

	public static void main(String[] args)
	{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the NUmber");
	int num  = input.nextInt();
    boolean e=even (num);
    System.out.println("even "+e);
	input.close();
	}

}
