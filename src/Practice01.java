public class Practice01 {
	public static void main(String[] args) {
		RacingCar rccar1;
		rccar1 = new RacingCar();
		rccar1.setCar(1234, 20.5);
		rccar1.setCourse(5);
	}
}
class Car{
	private int num;
	private double gas;
	public Car() {
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
class RacingCar extends Car{
	private int course;
	public RacingCar() {
		course = 0;
		System.out.println("生產了賽車");
	}
	public void setCourse(int c) {
		course = c;
		System.out.println("將賽車編號設為"+ course);
	}
}