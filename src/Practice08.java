public class Practice08 {
	public static void main(String[] args) {
		Car4_8 car1 = new Car4_8();
		Car4_8 car2 = new Car4_8();
		Car4_8 car3;
		car3 = car1;
		System.out.println("car1與car2相同 "+car1.equals(car2));
		System.out.println("car1與car3相同 "+car1.equals(car1));
	}
}
class Car4_8 {
	protected int num;
	protected double gas;
	public Car4_8() {
		num = 0;
		gas = 0;
		System.out.println("生產了車子");
	}
}
