public class Practice02 {
	public static void main(String[] args) {
		RacingCar2 rccar2;
		rccar2 = new RacingCar2(1234,20.5,5);
	}
}
class Car2{
	private int num;
	private double gas;
	public Car2() {
		num = 0;
		gas = 0;
		System.out.println("生產了車子");
	}
	public Car2(int a , double b) {
		num = a;
		gas = b;
		System.out.println("生產的車號為"+num+"，汽油量為"+gas+"的車子");
	}
	public void show() {
		System.out.println("車牌號碼為"+num);
		System.out.println("汽油量為"+gas);
	}
}
class RacingCar2 extends Car2{
	private int course;
	public RacingCar2(int a, double b, int c) {
		super(a,b);
		course = c;
		System.out.println("生產了編號為"+course+"的賽車");
	}
	public void setCourse(int c) {
		course = c;
		System.out.println("將賽車編號設為"+ course);
	}
}
