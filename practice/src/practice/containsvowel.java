package practice;

public class containsvowel {

	public static void main(String[] args) {
		System.out.println(containsvowel("vivek"));
		System.out.println(containsvowel("m"));

	}
	
	public static boolean containsvowel(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}

}
