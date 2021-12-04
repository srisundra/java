import java.util.Scanner;

public class HarryPotterAss7 {

	public static void main(String[] args) {
		String  MovieName[]=new String[5];
		Scanner input=new Scanner(System.in);
		for (int i=0;i<MovieName.length;i++)
		{
			System.out.println("Enter the Movie Name");
			String MovieName1=input.nextLine();
			MovieName[i]=MovieName1;
		}
		System.out.println("ALL MOVIE NAMES");
		System.out.println("----------------");
		for (String S: MovieName)
		{
			System.out.println( S);
		}
		input.close();
	}

}
