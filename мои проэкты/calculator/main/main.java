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
			
			switch(start){
				case("+"):
					Plus_menu pm = new Plus_menu();
					pm.start_Plus(last_operation);
					break;
			
				case("0"):
					System.exit(0);
					break;
			}
		}
	}
}
