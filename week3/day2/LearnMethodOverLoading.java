package week3.day2;

public class LearnMethodOverLoading {

	public void add() {
		int a=5,b=7;
		int c=a+b;
		System.out.println(c);
	}
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void name(String data,int age) {
		System.out.println("my name "+data+" my age "+age);
	}
	
	public void name(int age,String data) {
		System.out.println("my name "+data+" my age "+age);
	}
	
	
	public static void main(String[] args) {
		
		
		LearnMethodOverLoading ol=new LearnMethodOverLoading();
		
		
		ol.add();
		ol.add(10, 39);
		ol.name(27, "Dilip");
		ol.name("Vinoth", 29);
	}
	
	
	
}
