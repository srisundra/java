import java.util.Scanner;

public class HarryPotterAss2 {

	public static void main(String[] args) 
	{
		int MovYear[]= {2001,2002,2004,2005,2007,2009,2010,2011};
		System.out.println("Enter Total no of Movie");
		Scanner input = new Scanner(System.in);
		int TotNo=input.nextInt();
		System.out.println("Enter Total no of Movie "+TotNo);
		int TotNoMov=MovYear.length;
		int MovYear1=(MovYear[TotNoMov-1]-MovYear[TotNoMov -TotNoMov])/TotNoMov;
		int MovMon=(MovYear[TotNoMov-1]-MovYear[TotNoMov -TotNoMov])%TotNoMov;
		System.out.println("Average MOvie Release "+MovYear1+" year"+MovMon+" Months");
		input.close();

}
}