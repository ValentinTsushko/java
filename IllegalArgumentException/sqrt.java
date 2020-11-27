public class sqrt{
	public static double sqrt(double x) {
		if(x < 0){
			throw new  IllegalArgumentException( "Expected non-negative number, got " + x);
		}
		return Math.sqrt(x); // your implementation here
	}	

	public static void main(String [] args){
		java.util.Scanner in = new java.util.Scanner(System.in);
		double n = in.nextDouble();
		System.out.print(sqrt(n));
	}
}
