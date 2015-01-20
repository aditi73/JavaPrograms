public class MyClass
{
	int x,y ,z;
	MyClass()
	{
		this(2,3,4);
	}
	MyClass(int x,int y,int z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
		this.show();
	}
	void show()
	{
		System.out.println("x="+x+"y="+y+"z="
			+z);
	}
	public static void main(String a[])
	{
		MyClass m = new MyClass();


	}
}