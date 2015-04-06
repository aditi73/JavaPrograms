public class AreaTriangle
{
	double A;
	AreaTriangle(){}
	void show()
	{

		System.out.println("Area of triangle is="+A);
	}
	void Area(double b,double h)
	{
		A=(1.0/2.0)*(b*h);
		
	}
	public static void main(String as[])
	{   AreaTriangle a1=new AreaTriangle();
		if(as.length!=2)
			System.out.println("Enter exactly two arguments");
		else
		{
			double x,y;
			x=Double.parseDouble(as[0]);
			y=Double.parseDouble(as[1]);
			
			a1.Area(x,y);
			a1.show();


		}
	}
}