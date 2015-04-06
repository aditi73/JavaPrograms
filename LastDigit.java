class LastDigit
{ double ld;
	void show()
	{
		System.out.println("last digit of no. is "+ld);
	}
	LastDigit(double a)
	{
		ld = (a*7)%10;
	}

	public static void main(String[] args) {
      
      if(args.length!=1)
			System.out.println("Enter exactly one arguments");
		else
		{
		
		double x;
			x=Double.parseDouble(args[0]);
			LastDigit l=new LastDigit(x);
			l.show();	
		}
		
	}
}
