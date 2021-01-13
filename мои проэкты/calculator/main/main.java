import java.io.*;

public class main{
	public static void main(String [] args) throws java.io.IOException{
		java.util.Scanner in = new java.util.Scanner(System.in);
		//ltsStart:
		
		while(true){
			last last_operation = new last();
			System.out.println("Main Menu");
			System.out.println("");
			System.out.println("Hi");
			System.out.println("What're we doing now?");
			System.out.println("Operation plus (+), minus (-), multiply (*), division (/), power (^), sqrt (@), exit (0)");
			
			String start = in.nextLine();
			
			if(start.equals("+")){
				Plus p = new Plus();
				while(true){
					System.out.println("Okey, what're we doing now?");
					System.out.println("change first number (1), change second number (2),");
					System.out.println("plus(3), view first (4), view second (5),");
					System.out.println("view sum (6), view all operations (7), let's start anew (0)");

					start = in.nextLine();
					
					double x = 0;
					if(start.equals("0")) {
						System.out.println("");
						break;
					}
					else if(start.equals("1")) {
						x = in.nextDouble();
						p.plus_take_a(x);
						System.out.println("");
					}
					else if(start.equals("2")) {
						x = in.nextDouble();
						p.plus_take_b(x);
						System.out.println("");
					}
					else if(start.equals("3")) {
						p.plus();
						double tmp = p.plus_get_c();
						last_operation.add_last((double)tmp);
						System.out.println(tmp);
						System.out.println("");
					}
					else if(start.equals("4")) {
						System.out.println(p.plus_get_a());
						System.out.println("");
					}
					else if(start.equals("5")) {
						System.out.println(p.plus_get_b());
						System.out.println("");
					}
					else if(start.equals("6")) {
						System.out.println(p.plus_get_c());
						System.out.println("");
					}
					else if(start.equals("7")){
						last_operation.view();
					}
				}
			}
			
			else if(start.equals("0")) System.exit(0);
		}
	}
}
