public class Practice12 {
	public static void main(String[] args) {
		iVehicle[] vc = new iVehicle[2];
		vc[0] = new Car4_12(1234,20.5);
		vc[1] = new Plane4_12(232);
		for(int i=0;i<2;i++) {
			vc[i].show();
		}
	}
}
interface iVehicle{
	int weight =1000;
	void show();
}
class Car4_12 implements iVehicle{
	private int num;
	private double gas;
	public Car4_12(int a, double b) {
		num = a;
		gas = b;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}
class Plane4_12 implements iVehicle{
	private int plane;
	public Plane4_12(int a) {
		plane = a;
		System.out.println("生產了"+plane+"班次的飛機");
	}
	public void show() {
		System.out.println("飛機的班次是"+plane);
	}
}