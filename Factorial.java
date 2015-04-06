class Factorial
{   
	Factorial()
	{

	}
	static int factorial(int n)
	{
		int fact=1;
		while(n!=0)
		{
			fact*=n;
			n--;
		}
		return fact;
	}
	void show(int r)
	{
		System.out.println("Factorial="+r);
	}
	public static void main(String[] args)
	{
		
		if(args.length!=1)
			System.out.println("Enter only one argument");
		else
		{
			int x;
			x=Integer.parseInt(args[0]);
			Factorial f = new Factorial();
			int result = f.factorial(x);
			f.show(result);	
		}
	}
}