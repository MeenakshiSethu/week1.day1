package week1day1;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Fibonacci {
	//private void syso() {
		// TODO Auto-generated method stub

	//}

	//void function
	
	//for functionlality down arrow shows the for function
	
	
	public static void main(String[] args) {
		
		int range = 8;
		int firstNum = 0;
		int secNum = 1;
		int sum;
		
		System.out.println(firstNum);
		
		for (int i = 1; i <= range; i++) 
		
		{
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			
			System.out.println(sum);	
		}
		

	}

}
