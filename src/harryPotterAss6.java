
public class harryPotterAss6 {

	public static void main(String[] args) {
		int MovNo[]= {1,2,3,4,5,6,7,8};
		int MovYear[]= {2001,2002,2004,2005,2007,2009,2010,2011};
		String MovieName[]= {"Harry potter and the Philosopher's Stone","Harry Potter and the Chamber of secrets","Harry Potter and the Prisoner of Azkaban","Harry Potter and the Goblet of Fire","Harry Potter and the Order of the Phoenix","Harry Potter and the Half-Blood Prince","Harry Potter and the Deathly Halloes-Part 1","Harry Potter and the Deathly Halloes-Part 2"};
		System.out.println("Movie NUmber         "+"          Movie Name             "+"                         Movie Year    ");
		for(int i=0;i<MovNo.length;i++)
		{
			int j=MovNo[i];
			int k=MovYear[i];
			String S=MovieName[i];
			//System.out.println("Movie NUmber         "+"          Movie Name             "+"       Movie Year    ");
			System.out.println("    "+j+"                        "+S+"              "+k);
	}
	}

}
