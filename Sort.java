class Sort
{   
	Sort(){}
	void Sorting( int ...a)
	{
		int len=a.length;
		
		
		for(int i=0;i<len;i++)
		{
			for (int j=0;j<len;j++)
		 	{   
		 		if(a[i]<a[j])
		 		{
		 			int temp=a[i];
		 			a[i]=a[j];
		 			a[j]=temp;
		 		}
			}
		}
		this.show(a);
		
	}
	void show(int sarray[])
	{
		System.out.println("Sorted Array");
		for(int i=0;i<sarray.length;i++)
		{
			
			System.out.println(sarray[i]);
		}
		
	}
	
	public static void main(String[] args)
	{	Sort s = new Sort();
		int a1[]=new int[args.length];
		for (int i=0;i<args.length;i++)
		 	{   a1[i]=Integer.parseInt(args[i]);
		 	}
		s.Sorting(a1);
		
		
			
	}
}