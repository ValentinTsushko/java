public class pali{
	public static boolean isPalindrome(String text) {
		if (text.isEmpty()) {
            return true;
        }
		text = text.toLowerCase();
		text = text.replaceAll("[^0-9a-zA-Z]", "");
		StringBuffer s = new StringBuffer(text);
		s = s.reverse();
		return s.toString().equals(text);
	}
	public static void main(String[] args){
		java.util.Scanner in = new java.util.Scanner(System.in);
		//String A = in.nextLine();
		//StringBuffer a = new StringBuffer(A);
		String a = in.nextLine();
		System.out.println("");
		
		System.out.println(a); 
		System.out.print(isPalindrome(a));
	}
}
