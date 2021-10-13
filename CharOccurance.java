package week1day2;

public class CharOccurance {

	public static void main(String[] args)
	
	{
		String str1 = "welcome to chennai";
		int count = 0;
		char[] charArray1 = str1.toCharArray();
		int length=str1.length();
		for (int i=0;i<length;i++)
		{
			if(charArray1[i] == 'e')
				
			{
				
				count++;
				
				
			}
			
			
		}
		
		System.out.println("The number of occurrence is:" + count);

	}

}
