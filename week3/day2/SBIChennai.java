package week3.day2;

public class SBIChennai  extends SBIHQ{

	public void kyc() {
		System.out.println("Conc class- pan");
		
	}

	@Override
	public void ccard() {
		System.out.println(" salary above 25k");
		
	}
	
	public static void main(String[] args) {
		
		SBIChennai ch= new SBIChennai();
		ch.withdrawals();
		ch.fd();
		ch.kyc();
		ch.ccard();
	}

}
