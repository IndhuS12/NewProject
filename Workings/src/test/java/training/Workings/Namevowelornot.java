package training.Workings;

public class Namevowelornot {

	public static void main(String args[])
	{
		System.out.println(stringContainsVowels("indhu"));
		System.out.println(stringContainsVowels("vidhuran"));		
		
		
	}
	public static boolean stringContainsVowels(String input)
	{
		return input.toLowerCase().matches(".*[aeiou].*");
	}
}