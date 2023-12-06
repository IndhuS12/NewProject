package Strings;

import org.testng.annotations.Test;

public class StringCharAt {
	@Test
	public static void  charindex()
	{
		String name="Goodday";
		char newname=name.charAt(5);
		System.out.println(newname);
	}
	@Test
	public static void methodDispaly()
	{
		String welcome="You are welcome to java world";
		char good=welcome.charAt(15);
		System.out.println(good);
	}
	
	
	@Test
public static void firstAndLAst() {
	String  stringfunction="stringfunction is the tough";
	char display1=stringfunction.charAt(0);
	int Stringlength=stringfunction.length();
	char display2=stringfunction.charAt(Stringlength-1);
	System.out.println(display1);
	System.out.println(display2);
	
}
	@Test
	public static void oddAndEven()
	{
		String nameij="welcome to tamilnadu";
		for(int i=0;i<=nameij.length()-1;i++) {
			if(i%2!=0)
			{
				System.out.println(nameij.charAt(i));
			}
			
		}
	}

}
