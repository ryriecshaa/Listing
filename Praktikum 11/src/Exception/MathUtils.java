package Exception;

public class MathUtils{
	//-------------------------------------------------------------
	// Returns the factorial of the argument given
	//-------------------------------------------------------------
	public static int factorial(int n) throws IllegalArgumentException{
		if(n < 0){
			throw new IllegalArgumentException (n + " negative argument is not factorial");
		}
		else if(n > 16){
			throw new IllegalArgumentException (n + " not factorial");
		}
	int fac = 1;
	for (int i=n; i>0; i--)
	fac *= i;
	return fac;
	}
}