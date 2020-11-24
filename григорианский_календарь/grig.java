public class grig{
	public static int leapYearCount(int year) {
		int t = 0;
		for(int i = 0; i <= year; i++)
			if((i % 4 == 0) && (i % 100 != 0)){
				t++;
			}
			else if(i % 400 == 0){
				t++;
			}
		return (t - 1);
	}
	public static void main(String[] args){
		java.util.Scanner in = new java.util.Scanner(System.in);
		int a = in.nextInt();
		System.out.println();
		System.out.print("Ans: ");
		System.out.print(leapYearCount(a));
	}
}
