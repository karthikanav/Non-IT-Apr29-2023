package week1.day2;

public class LearnReturnType {

	public int addNo(int a,int b) {
		
		int c=a+b;
		//return a+b;
		return c;
		
	}
	
	public String getMyName() {
		return "TestLeaf";
		
	}
	
	public void rollNo() {
		System.out.println("1");
	}
	
	public static void main(String[] args) {
		
		LearnReturnType rt=new LearnReturnType();
		
		System.out.println(rt.addNo(5, 5));
		
		//System.out.println(rt.getMyName());
		//String output="TestLeaf";
		
		String output=rt.getMyName();
		System.out.println(output);
		
		rt.rollNo();
		
		
		
	}
}
