import java.util.Scanner;

public class HarryPotterAss5
{
public static void main(String arg[])
{
Scanner input=new Scanner(System.in);
int NoOfMov=8;



for(int i=1;i<=NoOfMov;i++)
{
	System.out.println("movie Number");
	int MovNo1=input.nextInt();
	
	System.out.println("your Movie Number "+MovNo1);
	switch(MovNo1)
	{
	case 1:System.out.println("Harry potter and the Philosopher's Stone");
	break;
	case 2:System.out.println("Harry Potter and the Chamber of secrets");
	break;
	case 3:System.out.println("Harry Potter and the Prisoner of Azkaban");
	break;
	case 4:System.out.println("Harry Potter and the Goblet of Fire");
	break;
	case 5:System.out.println("Harry Potter and the Order of the Phoenix");
	break;
	case 6:System.out.println("Harry Potter and the Half-Blood Prince");
	break;
	case 7:System.out.println("Harry Potter and the Deathly Halloes-Part 1");
	break;
	case 8:System.out.println("Harry Potter and the Deathly Halloes-Part 2");
	break;
	default:System.out.println("please enter 1 to 8\n"+"We have only 8 Movies");
	break;
	}
}


input.close();

}
}






