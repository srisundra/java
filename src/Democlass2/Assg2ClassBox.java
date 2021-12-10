package Democlass2;

public class Assg2ClassBox {
	private int length;
	private int width;
	private int height;
	public int classboxcon()
	{
		length=0;
		System.out.println("length is"+length);
		width=0;
		System.out.println("Width is"+width);
		height=0;
		System.out.println("Height is"+ height);
		//int vol= VolumeofBox();
		//System.out.println("volume is"+vol);
		return VolumeofBox();
	}
	public void classboxcon(int a)
	{
		length=a;
		System.out.println("length is"+length);
		width=a;
		System.out.println("Width is"+width);
		height=a;
		System.out.println("Height is"+ height);
		int vol= VolumeofBox();
		System.out.println("volume of a Box"+vol);
		
	
	}
	public void classboxcon(int l,int w,int h)
	{
		length=l;
		System.out.println("length is"+length );
		width=w;
		System.out.println("Width is"+width);
		height=h;
		System.out.println("Height is"+ height);
		int vol= VolumeofBox();
		System.out.println("volume is"+vol);
	}
	public int VolumeofBox() 
	{

		int volume = length*width*height;
	    return volume;
}
	}
