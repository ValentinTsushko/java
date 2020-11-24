import java.math.*;

public class fact{
	public static BigInteger factorial(int value) {
		BigInteger result = new BigInteger("1");

		if (value == 0) {
			return result;
		}
		if (value == 1) {
			return result;
		}
		
		BigInteger value1 = BigInteger.valueOf(value);
		result = value1.multiply(factorial(value - 1));

		return result;
	}
	public static void main(String[] args){
		java.util.Scanner in = new java.util.Scanner(System.in);
		int a = in.nextInt();
		System.out.println(" ");
		System.out.print(factorial(a));
	}
}
