public class A{
	public static boolean doubleExpression(double a, double b, double c) {
		return ((Math.abs((a+b)-c)) < (1e-4));
	}
	public static void main(String[] args){
		java.util.Scanner in = new java.util.Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		System.out.print(doubleExpression(a, b, c));
	}
}
