package Strings;

import org.testng.annotations.Test;

public class Contains {
	@Test
	public static void stringContains()
	{
		String a="testng is the framework used in the selenium ";
		System.out.println(a.contains("used in the selenium"));
		System.out.println(a.contains("maven project"));
		
	}

}
