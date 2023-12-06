package Strings;

import org.testng.annotations.Test;

public class StringFormat {
	@Test
	public static void stringFormatting()
	
	{
		String s1="Indhu";
		String s2=String.format("%s", s1);
		System.out.println(s2);
	}

}
