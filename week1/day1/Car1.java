package week1.day1;

public class Car1 {

	//accessspecifier returntype methodname(Input args)
	
	public void subject(int e,int m,int si,int s,int l) {
		
		int marks=e+m+si+s+l;
		System.out.println("total marks :"+marks);
	}
	
public static void main(String[] args) {
	
	//classname objname= new classname();
	
	//object.methodname
	  Car1 c=new Car1();
	  
	  c.subject(45, 78, 90, 67, 76);
	  c.subject(49, 56, 97, 65, 55);
	  
	
}
	
	
}
