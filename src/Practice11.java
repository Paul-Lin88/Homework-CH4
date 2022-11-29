public class Practice11 {
	public static void main(String[] args) {
		Vehicle2[] vc = new Vehicle2[2];
		vc[0] = new Car4_11(1234,20.5);
		vc[1] = new Plane4_11(232);
		for(int i=0;i<2;i++) {
			if(vc[i] instanceof Car4_11)
				System.out.println("第"+(i+1)+"個物件是Car4_11類別");
			else
				System.out.println("第"+(i+1)+"個物件不是Car4_11類別");
		}
	}
}
abstract class Vehicle2{
	protected int speed;
	protected void setSpeed(int s) {
		speed = s;
		System.out.println("將速度設為"+speed);
	}
	abstract void show();
}
class Car4_11 extends Vehicle2{
	private int num;
	private double gas;
	public Car4_11(int a, double b) {
		num = a;
		gas = b;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("速度是"+speed);
	}
}
class Plane4_11 extends Vehicle2{
	private int plane;
	public Plane4_11(int a) {
		plane = a;
		System.out.println("生產了"+plane+"班次的飛機");
	}
	public void show() {
		System.out.println("飛機的班次是"+plane);
		System.out.println("速度是"+speed);
	}
}