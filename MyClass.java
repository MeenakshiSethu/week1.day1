
public class MyClass {

	int num1, num2, num3;
	int output;

	public void add()

	{
		num1 = 50;
		num2 = 30;
		num3 = 10;
		output = num1 + num2 + num3;
		System.out.println("the addition result is" + output);
	}

	public void subtraction() {

		num1 = 50;
		num2 = 30;
		num3 = 10;
		output = num1 - num2 - num3;
		System.out.println("The output of subtraction is " + output);
	}

	public void multiplication() {

		num1 = 50;
		num2 = 30;
		output = num1 * num2;
		System.out.println("The output of multiplication is " + output);
	}

	public void division() {

		num1 = 50;
		num2 = 30;
		output = num1 / num2;
		System.out.println("The output of division is " + output);
	}

	public static void main(String[] args) {
		MyClass new1 = new MyClass();
		new1.add();
		new1.subtraction();
		new1.multiplication();
		new1.division();

	}

}
