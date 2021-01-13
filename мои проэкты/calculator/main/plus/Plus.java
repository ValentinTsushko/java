package plus;

public class Plus{
	double a = 0;
	double b = 0;
	double c = 0;
	
	public void plus_take_a(double c){
		this.a = c;
	}
	public double plus_get_a(){
		return this.a;
	}
	
	public void plus_take_b(double c){
		this.b = c;
	}
	public double plus_get_b(){
		return this.b;
	}
	
	public double plus_get_c(){
		return this.c;
	}
	
	public void plus(){
		this.c = a + b;
	}
}
