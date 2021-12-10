package Democlass2;

import java.util.Scanner;

public class Assg2BankAccount {

	public static void main(String[] args) {
		 
		 Scanner input=new Scanner(System.in);
		 System.out.println("Enter the Account number  ");
		 int acc=input.nextInt();
		 System.out.println("Enter the Name  ");
		 String n=input.next(); 
		 System.out.println("Enter the Balance  ");
		 double bal=input.nextInt();
		 Assg2ClassAccount acc1=new Assg2ClassAccount(acc,n,bal);
		 System.out.println("Enter the Amount to  Deposite  ");
		 int dep=input.nextInt();
		 acc1.depositeAmount(dep);
		 acc1.GetAccBalance();
		 System.out.println("Enter the withdrawal Amount  ");
		 int wit=input.nextInt();
		 acc1.withdrawAmount(wit);
		 acc1.GetAccBalance();
		 input.close();
		
	}

}
