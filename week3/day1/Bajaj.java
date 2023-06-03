package week3.day1;

public class Bajaj extends Auto{

	public void handGear() {
		System.out.println("bajaj-c");
	}
	
	public static void main(String[] args) {
		Bajaj b=new Bajaj();
		b.brake();
		b.soundHorn();
		b.meter();
		b.handGear();
	}
}
