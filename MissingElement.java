
import java.util.Arrays;
public class MissingElement {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,9};
		int length = arr.length;
		
		Arrays.sort(arr);
		for (int i=0;i<length;i++)
		{
			if(arr[i]+1!=arr[i+1])
				
			{
				System.out.println("Missing element is:" + (arr[i]+1));
				break;
			}
		}
	}

}
