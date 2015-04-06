class TwoDArray
{
public static void main(String[] args) {
float arr[][]={{-56.7f},{500.1f,70.7f},{100.9f,0.5f,20.20f}};
System.out.println("Elements are:");
for(int i=0;i<3;i++){
	
for(float e:arr[i]){
System.out.print(e +" ");
}System.out.println();
}
System.out.println("The length is : " + arr.length);
}
}