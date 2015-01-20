public class Average
{
	double sum,avg;
	
	Average(double x[])
	{	
		for (int i=0;i<4;i++)
		{
			
			sum=sum+x[i];
		}
		avg=sum/4;
		this.showresult();
	}
	void showresult()
	{
		System.out.println("average is"+avg);
	}
	public static void main(String args[])
	{
		
		double a[]={21.3,34.5,22.6,12.5};
		Average m = new Average(a);
	}

}