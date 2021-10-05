package week1day1;

public class Prime {
	
	

	public static void main(String[] args) {
		int num = 17;
		boolean value = false;
		int range = num/2;
		for (int i=2;i<=range;i++)
			
		{
			if (num%i==0)
			{
				value = true;
		
			}
			
		}
		
		if (value == true)
			
		{ 
			System.out.println("this is a not a prime number");
		}
		
		else if (value == false)
			
		{
			
			System.out.println("this is a prime number");
		}

	}

}
