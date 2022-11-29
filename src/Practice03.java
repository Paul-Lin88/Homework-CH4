public class Practice03 {
	public static void main(String[] args) {
		RacingCar3 rccar1;
		rccar1 = new RacingCar3();
		rccar1.newshow();
	}
}
class Car3{
	protected int num;
	protected double gas;
	public Car3() {
		num = 0;
		gas = 0;
		System.out.println("生產了車子");
	}
	public void show() {
		System.out.println("車牌號碼為"+num);
		System.out.println("汽油量為"+gas);
	}
}
class RacingCar3 extends Car3{
	private int course;
	public RacingCar3() {
		course = 0;
		System.out.println("生產了賽車");
	}
	public void setCourse(int c) {
		course = c;
		System.out.println("將賽車編號設為"+ course);
	}
	public void newshow() {
		System.out.println("賽車的牌號碼為"+num);
		System.out.println("汽油量為"+gas);
		System.out.println("賽車的編號是"+course);
	}
}