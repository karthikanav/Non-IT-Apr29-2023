package week3.day1;

public class Audi extends Car{

	public void sunRoof() {
		System.out.println("audi-c");
	}
	public static void main(String[] args) {
		Audi a=new Audi();
		a.brake();
		a.soundHorn();
		a.trunAC();
		a.sunRoof();
	}
}
