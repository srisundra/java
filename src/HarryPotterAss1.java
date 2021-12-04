import java.util.Scanner;

public class HarryPotterAss1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the  First Harry Potter Movie Year");
		int firstmov=input.nextInt();
		System.out.println("Enter the Last Harry Potter Movie Year");
		int lastmov=input.nextInt();
		int remov=lastmov - firstmov;
		System.out.println("Time difference "+remov); 
		input.close();
	}

}
