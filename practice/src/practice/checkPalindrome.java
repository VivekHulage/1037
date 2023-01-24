package practice;

public class checkPalindrome {

	public static void main(String[] args) {
		System.out.println(checkPalindrome.checkpalindrome("radar"));
		System.out.println(checkPalindrome.checkpalindrome("vivek"));
	}
	public static boolean checkpalindrome(String input) {
		boolean result=true;
		int length=input.length();
		for(int i=0;i<length/2;i++){
			if(input.charAt(i)!=input.charAt(length -i-1)) {
				return false;
			}
		}
		return true;
	}

}
