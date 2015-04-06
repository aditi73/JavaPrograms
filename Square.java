import mypkg.*;
class Square extends Shape implements Area,Peri
{
	Square(int b){
		super(b);
	}
	public void showarea()
	{
		System.out.println("area = "+a*a);
	}
	public void showperi()
	{
		System.out.println("perimeter = "+4*a);
	}
	public static void main(String[] args) {
		Square s1 = new Square(13);
		s1.showarea();
		s1.showperi();

	}
}