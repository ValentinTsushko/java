public class change{
	public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
    return (a & b & (!c) & (!d)) ^ ((!a) & (!b) & c & d) ^ ((!a) & (b) & (!c) & (d)) ^ ((!a) & (b) & (c) & (!d)) ^ ((a) & (!b) & (!c) & (d)) ^ ((a) & (!b) & (c) & (!d));
	}
	public static void main(String[] args){
		java.util.Scanner i = new java.util.Scanner(System.in);
		boolean a = i.nextBoolean();
		boolean b = i.nextBoolean();
		boolean c = i.nextBoolean();
		boolean d = i.nextBoolean();
		System.out.println("");
		System.out.print("Ans: ");
		System.out.print(booleanExpression(a, b, c, d));
	}
}
