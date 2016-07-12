package Task2Bonus;

public class FunctionY {

	public static void main(String[] args) {
		
		double y = 0;
		for (double x = -4; x<=4; ){
        	y = Math.pow(2*x, 2) - 5 * x -8;
        	x = x + 0.5;
        }
        System.out.println("y = " + y); // Output result
	}

}
