import java.util.Scanner;

public class HattyPotterAss3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Movie Number(1 to 8)");
		int MovNo=input.nextInt();
		switch (MovNo)
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
		default:System.out.println("You Entered "+MovNo+"  as a Movie Number");
		System.out.println("We have only 8 Movies");
		
		}
		input.close();

	}

}
