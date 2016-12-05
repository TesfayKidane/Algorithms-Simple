
public class GCD {

	public static int gcd(int x, int y)
	{
		return (y==0) ? x : gcd(y, x%y);
	}
	
	public static void main(String[] args)
	{
		System.out.println(gcd(10,25));
	}
}
