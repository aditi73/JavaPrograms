interface P
{
	double PI = 3.14;	
	public void displayP();
}
interface P1 extends P
{
	final String S = "JAVA";
	public void displayP1();
}
interface P2 extends P
{
	final int I = 45;
	public void displayP2();
}
interface P12 extends P1,P2
{
	final char C='p';
	public void displayP12();
}
class Q implements P12
{
	public static void main(String args[])
	{
		Q q = new Q();
		
		q.displayP();
		q.displayP1();
		q.displayP2();
		q.displayP12();
	
	}
	    public void displayP()
		{
			System.out.println("val. of cons. is:"+PI);
		}
		public void displayP1()
		{
			System.out.println("val. of cons. is:"+S);
		}
		public void displayP2()
		{
			System.out.println("val. of cons. is:"+I);
		}
		public void displayP12()
		{
			System.out.println("val. of cons. is:"+C);
		}
		

}