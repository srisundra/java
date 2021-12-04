import java.util.Scanner;

public class HarryPotterAss4 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the first or last movie number(1 or 8)");
	int mov=input.nextInt();
	if(mov == 1)
	{
		System.out.println("First Movie");
	}
	else if(mov == 8)
	{
		System.out.println("Last Movie");	
	}
	else
	{
		System.out.println("you entered No  "+mov+"  This is not first or last movie");
	}
	input.close();
	}

}
