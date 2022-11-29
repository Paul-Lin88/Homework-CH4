public class Practice10 {
	public static void main(String[] args) {
		Vehicle[] vc = new Vehicle[2];
		vc[0] = new Car4_10(1234,20.5);
		vc[0].setSpeed(60);
		vc[1] = new Plane4_10(232);
		vc[1].setSpeed(500);
		for(int i=0;i<2;i++) {
			vc[i].show();
		}
	}
}
abstract class Vehicle{
	protected int speed;
	protected void setSpeed(int s) {
		speed = s;
		System.out.println("將速度設為"+speed+"了");
	}
	abstract void show();
}
class Car4_10 extends Vehicle{
	private int num;
	private double gas;
	public Car4_10(int a, double b) {
		num = a;
		gas = b;
		System.out.println("生產了車號為"+num+"汽油量為"+gas+"的車子");
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("速度是"+speed);
	}
}
class Plane4_10 extends Vehicle{
	private int plane;
	public Plane4_10(int a) {
		plane = a;
		System.out.println("生產了"+plane+"班次的飛機");
	}
	public void show() {
		System.out.println("飛機的班次是"+plane);
		System.out.println("速度是"+speed);
	}
}