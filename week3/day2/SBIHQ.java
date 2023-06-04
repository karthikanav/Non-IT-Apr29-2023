package week3.day2;

public abstract class SBIHQ implements RBI {

	public void withdrawals() {
		System.out.println("abst class- withdrawals");
		
	}

	public void fd() {
		System.out.println("abst class- fd");
		
	}
	
	//one abstract method
	public abstract void ccard();
	
	public static void main(String[] args) {
		
		//SBIHQ s=new SBIHQ();//we cannot create object abstract class
	}

}
