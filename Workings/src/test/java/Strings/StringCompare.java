package Strings;

import org.testng.annotations.Test;

public class StringCompare {
	
	@Test
	
	public static void comparsionBEtweenStrings() {
		 String s1="India";
		 String s2="country";
		 String s3="";
		 String s4="India";
		 String s5="COUNTRY";
		 System.out.println(s1.compareTo(s2));
		 System.out.println(s1.compareTo(s3));
		 System.out.println(s1.compareTo(s4));
		 System.out.println(s2.compareTo(s5));
		 System.out.println(s3.compareTo(s5));
		
	}

}
/*
-26
5
0
32
-7*/