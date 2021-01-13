package last;

import java.util.ArrayDeque;

public class last{
	/*
	ArrayList last = new ArrayList();
	//last.add(new Double(0));
	
	void add_last(double x){
		last.add(new Double(x));
	}
	void view(){
		System.out.println(last);
	}
	*/
	
	ArrayDeque<Double> last = new ArrayDeque<Double>();
	
	public void add_last(double x){
		last.addLast(x);
	}
	public void view(){
		int j = 0;
		for(double i : last)
			System.out.println(++j + ")  " + i);
	}
	
	/*
	Deque<Double> last;
	last.add(0);
	
	public void add_last(double x){
		last.add(x);
	}
	public void view(){
		for(double i : last)
			System.out.println(last);
	}
	*/
}
