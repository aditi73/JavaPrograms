class ThrowDemo
{
	public static void main(String[] args) {
		int a[]=new int[5];
		try
		{
			if(args.length != 5)
			{
				ArrayIndexOutOfBoundsException ae = new ArrayIndexOutOfBoundsException();
				throw ae;
			}
			for (int i=0;i<args.length;i++)
			{	
				try
				{
				a[i]=Integer.parseInt(args[i]);
				if (args[i] == null){
					NullPointerException ne = new NullPointerException();
					throw ne;
				}
			}
				catch(NullPointerException ne){
					System.out.println("Please enter some number");
				}

				catch(Exception e){
					System.out.println("Invalid format");
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("Enter only 5 values");
		}

	}
}