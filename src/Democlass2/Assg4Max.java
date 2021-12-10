package Democlass2;
//Write  a method that takes an int array as a parameter and returns the largest number in the array.
import java.lang.reflect.Array;
import java.util.Scanner;

public class Assg4Max {
	public static int sortarray(int[] s)
	{
		int max=s[0];
		for(int i=0;i<s.length; i++)
		{
			
		if(max<s[i])
		{
			max=s[i];
		}

	}
		return max;
		}

	public static void main(String[] args) {
		int sort[]=new int[10];
Scanner input=new Scanner(System.in);
System.out.println("enter the number to sort");
for(int i=0;i<sort.length;i++)
{	
int sortn=input.nextInt();
sort[i]=sortn;
	}
int maximum=sortarray(sort);
System.out.println("Maximum Number"+maximum);
input.close();
}
	}
