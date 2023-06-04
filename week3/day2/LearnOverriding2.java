package week3.day2;

public class LearnOverriding2 extends LearnOverriding1 {

	public void phone() {
		System.out.println("iphone 14");
	}
	public static void main(String[] args) {
		LearnOverriding2 lo= new LearnOverriding2();
		lo.phone();
	}
}
