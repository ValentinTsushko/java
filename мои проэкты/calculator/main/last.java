import java.util.*;

public class last{
	
	ArrayList last = new ArrayList();
	//last.add(new Double(0));
	
	void add_last(double x){
		last.add(new Double(x));
	}
	void view(){
		System.out.println(last);
	}
	
	/*
	ArrayDeque<Double> last = ArrayDeque<Double>();
	
	void add_last(double x){
		last.addLast(x);
	}
	*/
}
