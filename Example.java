public class Example
{
	static int s;
	char ch;
	Example()
	{
		ch = 'a';
		s++;
	}
	Example(int y,char z)
	{
		s=y;
		ch=z;
		s++;
	}
	void show()
	{
		for(int i=1;i<=6;i++)
		{	
			System.out.println(" ");
			for(int j=1;j<=i;j++)
			{	
				System.out.print(s);
			}
		}
	}
	public static void main(String args[])
	{
		System.out.println("s ="+s);
		Example e1 = new Example();
		Example e2 = new Example(11,'f');
		e1.show();
		e2.show();
	}
}