package week1day2;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "stops"; 
		int length;
		int lenght2;
	if(text1.length() == text2.length())
	{
		char[] charArray1 = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		System.out.println(charArray1);
		System.out.println(charArray2);
		if (Arrays.equals(charArray1, charArray2))
		{
			System.out.println("same value");
		}
		
		else
		{
			System.out.println("different value");
		}
	}
	}

}
