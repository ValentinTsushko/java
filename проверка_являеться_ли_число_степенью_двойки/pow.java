public class pow{
	public static boolean doubleExpression(int a) {
		int i = 1;
		a = Math.abs(a);
		while(i < a){
			i *= 2;
		}
		if(i > a){
			return false;
		}
		return true;
	}
	public static void main(String[] args){
		java.util.Scanner in = new java.util.Scanner(System.in);
		int a = in.nextInt();
		System.out.print(doubleExpression(a));
	}
}
