package Strings;

import org.testng.annotations.Test;

public class StringConcat {
	@Test
	public static void stringConcatenation()
	{
		String s1="I love India ";
		String s2="because its culture is good";
		String s3=s1.concat(s2);
		String s4="icecream".concat("@@@######3333333");
		System.out.println(s3.concat("i love nature"));
		System.out.println(s4);
		
	
	}

}
