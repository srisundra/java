package Democlass2;

import java.util.Scanner;

//Write an overloaded method  - area(), one to find area of a rectangle and takes its length and width as parameter and the other one to find area of a circle, takes its radius as a parameter. 
//Area of rectangle = length*width
//Area of circle= 3.14*r*r

public class Assgn2area {
	
	public static  void area(int r)
	{
		double Areaofcircle= 3.14*r*r;
		 System.out.println("Area of the circle   " +Areaofcircle);
	}
	public static int area(int l,int w)
	{
		int AreaofRec=l*w;
		return AreaofRec;
	}

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the circle Radius");
		int a=input.nextInt();
		area(a);
		System.out.println("Enter the length of rectangle");
		int l=input.nextInt();
		System.out.println("Enter the width of rectangle");
		int w=input.nextInt();
		int rect=area(l,w);
		System.out.println("Area of the rectangle   "+rect);
		input.close();
	}

}
