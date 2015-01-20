public class Hypotenuse
{
	double base, perp ,hyp;
	Hypotenuse(double b, double p)
	{

		base=b;
		perp=p;
		hyp=Math.sqrt(base*base+perp*perp);
		System.out.println("Hypotenuse is "+hyp);
	}
	public static void main(String args[])
	{
		Hypotenuse h1=new Hypotenuse(22.5,42.5);
	}

}