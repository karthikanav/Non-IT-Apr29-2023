package week3.day2;

public class SBI implements RBI {

	public void withdrawals() {
		System.out.println("withdrawal-limit above 10L");
	}

	public void kyc() {
		System.out.println("kyc -pan");
	}

	public void limitWithdrawal() {
		System.out.println("limit min- 50k");
	}
	
	public void fd() {
		System.out.println(" fd-6.6");
		
	}
	
	
	public static void main(String[] args) {
		
		//RBI a=new RBI();//we cannot create object interface
		
		SBI s=new SBI();
		s.withdrawals();
		s.kyc();
		s.fd();
		s.limitWithdrawal();
		
	}

	
}
