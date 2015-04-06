class StringBufferDemo{
public static void main(String args[])
{
	StringBuffer sb=new StringBuffer("Hello! ");
	sb.append("How are you");
System.out.println("String after append:  "+sb);
	sb.insert(6,"Aditi ");
	System.out.println("String after insertion:  "+sb);
		sb.delete(6,12);
System.out.println("String after deletion:  "+sb);
sb.deleteCharAt(5);
System.out.println("String after deletion at pos 5:  "+sb);
sb.replace(0,5,"Hey");
System.out.println("String after replacement:  "+sb);
}
}