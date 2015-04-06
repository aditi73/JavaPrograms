class AvgStringSize
{   
	double avgsize;
	AvgStringSize(String k[])
	{ 
		double sum=0;
		for(int i=0;i<k.length;i++)
		{
			sum+=k[i].length();
		}
		avgsize=sum/5;
	}
	void show()
	{
		System.out.println("Average size="+avgsize);
	}
	public static void main(String[] args)
	{
		
		if(args.length!=5)
			System.out.println("Enter exactly five arguments");
		else
		{
			AvgStringSize a= new AvgStringSize(args);
			a.show();
		}
	}

}