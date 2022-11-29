public class Practice13 {
	public static void main(String[] args) {
		Car4_13 car1 = new Car4_13(1234,20.5);
		car1.ishow();
		car1.mshow();
	}
}
interface iVehicle2{
	void ishow();
}
interface iMaterial{
	void mshow();
}
class Car4_13 implements iVehicle2,iMaterial{
	private int num;
	private double gas;
	public Car4_13(int a, double b) {
		num = a;
		gas = b;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	public void ishow() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	public void mshow() {
		System.out.println("車子的材質是鐵");
	}
}