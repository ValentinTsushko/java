import java.util.function.DoubleUnaryOperator;

public class integral {


    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double h, sum = 0;
		int eps = 10000000;
		h = (b - a)/eps;
		
		for(int i = 0; i < eps; i++){
			sum += f.applyAsDouble(a + h*(i + 0.5)); // psevdokod s wikipedii
		}
		
		sum *= h;
		
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(integrate(x -> 1, 0, 10));//10.0
        System.out.println(integrate(x -> x + 2, 0, 10));//70.0
        System.out.println(integrate( x -> Math.sin(x) / x , 1, 5));//0.603848
    }
}
