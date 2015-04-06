package mypkg;
class A
{
	void show()
	{
		System.out.println("This is class A");
	}
} 
public class B
{	public static void main(String[] args) {
	

	A a = new A();
	a.show();
}
}