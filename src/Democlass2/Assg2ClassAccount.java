package Democlass2;

public class Assg2ClassAccount 
{
	private int AccNum;
	private String Name;
	private double balance;
	
public Assg2ClassAccount(int acc, String n, double bal)
{
	AccNum=acc;
	Name=n;
	balance=bal;
}
public void depositeAmount(int Amount)
{
	balance=balance+Amount;
	System.out.println("Depsited Amount  "+Amount);
	System.out.println("Name  "+Name);
	System.out.println("Accnum  "+AccNum);
	System.out.println("Now your Account Balance  $"+balance);

}

public void withdrawAmount(int withdrawamt)
{
	if(balance>withdrawamt)
	{
		balance=balance-withdrawamt;
		System.out.println("Name  "+Name);
		System.out.println("Accnum  "+AccNum);
		System.out.println("Afterwithdrawal Balance Amount is  $"+balance);
	}
	else
		System.out.println("your Balance Amount is less than withdrawal");
}
public void GetAccBalance()
{
	System.out.println("Name   "+Name);
	System.out.println("Accnum  "+AccNum);
	System.out.println("Balance Amount  $"+balance);	
	
	}
}