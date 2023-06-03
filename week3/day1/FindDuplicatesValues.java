package week3.day1;

public class FindDuplicatesValues {

	public static void main(String[] args) {
		int[] num= {2,4,5,7,1,3,2,7,6};
		//2,7
		//two forloop
		//if condition
		//syso();
		
		for (int i = 0; i < num.length; i++) {
			
			for (int j = i+1; j < num.length; j++) {
				
				if(num[i]==num[j]) {
					System.out.println("duplicate values: "+num[i]);
				}
			}
		}

	}

}
