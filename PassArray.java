//Advanced for loop:syntax:for(variable:arrayname)
//there is no need to check terminating condition
//In this we can't modify the elements of array 
class PassArray

{
	public static void main(String a[])
	{
		int a[] = {1,5,7,9}; //creation initialisation and declaration of array
		PassArray pa = new PassArray();
		System.out.println("Array before func call");
		for(int x:a)//Advance or enhanced for loop
		{
			System.out.println(x);

		}
		pa.modifyArray(a);
		System.out.println("Array after func call");
		for(int y:a)
		{
			System.out.println(y);

		}
		void modifyArray(int k[])

		{
			for(int i=0;i<4;i++)
			{
				k[i]*=2;
			}
		}


	}
}
