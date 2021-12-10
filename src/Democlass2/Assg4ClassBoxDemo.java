package Democlass2;

public class Assg4ClassBoxDemo {

	public static void main(String[] args) {
		
		Assg2ClassBox c=new Assg2ClassBox();
		c.classboxcon();
		int vol=c.VolumeofBox();
	    System.out.println ("volume of the Box"+vol);
		c.classboxcon(7);
		c.classboxcon(3, 4, 5);
	}
}
