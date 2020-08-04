package qiche;

public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car volvo=new Car("Œ÷∂˚Œ÷","black",5,30000);
System.out.print(volvo.brand);
System.out.print(volvo.color);
System.out.print(volvo.loader);
System.out.print(volvo.pice);
	}

}
class Vehicle{
	String brand;
	String color;
	int loader;
	public Vehicle (String brand,String color, int loader) {
		this.brand=brand;
		this.color=color;
		this.loader=loader;
	}
	}

class Car extends Vehicle{
double pice;

	
	
}