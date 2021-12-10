package Democlass2;
//Write an overloaded method that takes two parameters and return if they have equal value or not. For eg, if you pass two Strings, the method should return true if the Strings are equal else false. If you pass two integers, the method should return if they are equal else false.


public class Assg2overloadc
{
	
	public static boolean equal(int a,int b)
	{
		if(a==b)
			return true;
		else
			return false;
	}

	public static boolean equal(String s,String s1)
	{
		if(s.equals(s1))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
       boolean eq=equal(5,6);
       System.out.println("The passing Numbers are Equals  "+eq);
       boolean eq1=equal(6,6);
       System.out.println("The passing Numbers are Equals  "+eq1);
       boolean str=equal("sri","sri");
       System.out.println("The passing Strings are Equals   "+str);
       boolean str1=equal("sri","srid");
       System.out.println("The passing Strings are Equals   "+str1);
       
	}

}
