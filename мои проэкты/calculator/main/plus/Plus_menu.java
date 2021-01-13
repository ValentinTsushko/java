package plus;
import last.*;

public class Plus_menu{
	public void start_Plus(last last_operation){
		java.util.Scanner in = new java.util.Scanner(System.in);
		Plus p = new Plus();
		while(true){
			System.out.println("");
			System.out.println("Okey, what're we doing now?");
			System.out.println("change first number (1), change second number (2),");
			System.out.println("plus(3), view first (4), view second (5),");
			System.out.println("view sum (6), view all operations (7), let's start anew (0)");

			byte start = in.nextByte();
					
			double x = 0;
			if(start == (0)) {
				System.out.println("");
				break;
			}
			switch(start){
				case(1):
					System.out.println("");
					x = in.nextDouble();
					p.plus_take_a(x);
					System.out.println("");
					break;
				
				case(2):
					System.out.println("");
					x = in.nextDouble();
					p.plus_take_b(x);
					System.out.println("");
					break;
				
				case(3):
					System.out.println("");
					p.plus();
					double tmp = p.plus_get_c();
					last_operation.add_last((double)tmp);
					System.out.println(tmp);
					System.out.println("");
					break;
					
				case(4):
					System.out.println("");
					System.out.println(p.plus_get_a());
					System.out.println("");
					break;
					
				case(5):
					System.out.println("");
					System.out.println(p.plus_get_b());
					System.out.println("");
					break;
				
				case(6):
					System.out.println("");
					System.out.println(p.plus_get_c());
					System.out.println("");
					break;
				
				case(7):
					System.out.println("");
					last_operation.view();
			}
		}
	}
}
