class Calculator
{
	static int powerInt(int a,int b)
	{
		return (int) Math.pow(a, b);
	}
	static double powerDouble(double a,double b)
	{
		return Math.pow(a, b);
	}
}
/**
 * @author Personal
 *
 */
public class TestingCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calculator.powerInt(2, 5));
		System.out.println(Calculator.powerDouble(5.5, 2));

	}

}
