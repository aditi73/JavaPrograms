interface AntiLockBrakes
{
	public void antiLockBrakes();
}
interface CruiseControl
{
	public void cruiseControl();
}
interface PowerSteering
{
	public void powerSteering();
}
class Model1 implements PowerSteering
{
	public void powerSteering()
	{
		System.out.println("PowerSteering is available for model1");
	}
}
class Model2 implements AntiLockBrakes,CruiseControl
{
	public void antiLockBrakes(){}
	public void cruiseControl(){}
	public void show()
	{
		System.out.println("CruiseControl and AntiLockBrakes is available for model2");
	}
}
class Model3 implements CruiseControl
{
	public void cruiseControl()
	{
		System.out.println("CruiseControl is available for model3");
	}
}
class Automobiles
{
	public static void main(String[] args) {
		Model1 m1 = new Model1();
		Model2 m2 = new Model2();
		Model3 m3 = new Model3();
		m1.powerSteering();
		m2.show();
		m3.cruiseControl();
	}
}