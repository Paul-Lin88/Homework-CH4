public class Practice07{
	public static void main(String[] args) {
		Car4_7 car1;
		car1 = new Car4_7();
		car1.setCar(1234, 20.5);
		System.out.println(car1);
	}
}
class Car4_7{
	protected int num;
	protected double gas;
	public Car4_7() {
		num = 0;
		gas = 0;
		System.out.println("生產了車子");
	}
	public void setCar(int a , double b) {
		num = a;
		gas = b;
		System.out.println("生產的車號為"+num+"，汽油量為"+gas);
	}
	public String toString() {
		String str = "車牌號碼為"+num+";汽油量為"+gas;
		return str;
	}
}