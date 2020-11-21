import java.io.*;

public class robot{
	public static void moveRobot(Robot1 robot, int toX, int toY) {
		//robot.stepForward(); 
		System.out.print("x = ");
		System.out.println(robot.x);
		System.out.print("y = ");
		System.out.println(robot.y);
		
	}
	public static void main(String[] args){
		java.util.Scanner in = new java.util.Scanner(System.in);
		Robot1 obot = new Robot1();
		int x = in.nextInt();
		int y = in.nextInt();
		moveRobot(obot, x, y);
	}
}
