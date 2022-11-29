public class Practice04{
	public static void main(String[] args) {
		RacingCar4_4 rccar1;
		rccar1 = new RacingCar4_4();
		rccar1.setCar(1234, 20.5);
		rccar1.setCourse(5);
		rccar1.show();
	}
}
class Car4_4{
	protected int num;
	protected double gas;
	public Car4_4() {
		num = 0;
		gas = 0;
		System.out.println("生產了車子");
	}
	public void setCar(int a , double b) {
		num = a;
		gas = b;
		System.out.println("生產的車號為"+num+"，汽油量為"+gas);
	}
	public void show() {
		System.out.println("車牌號碼為"+num);
		System.out.println("汽油量為"+gas);
	}
}
class RacingCar4_4 extends Car4_4{
	private int course;
	public RacingCar4_4() {
		course = 0;
		System.out.println("生產了賽車");
	}
	public void setCourse(int c) {
		course = c;
		System.out.println("將賽車編號設為"+course);
	}
	public void show() {
		System.out.println("賽車的車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("賽車編號是"+course);
	}
}