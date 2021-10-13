package week1day2;

public class Day3 {

	public static void main(String[] args) {
		// Literals( data)
		String str3 = "madam";
		String rev = "";

		char[] charArray = str3.toCharArray();
		int length = charArray.length;

		for (int i = length-1; i >= 0; i--) {
			rev = rev + charArray[i];
		}
		if (str3.equals(rev)) {
			System.out.println("It is a Palindrome");
		} else
			System.out.println("Not a Palindrome");

	}

}
