package week3.day1;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		//array literal
		int[] mark= {45,56,98,67,78};
		/*45,56,67,78,98
		 * mark[0]=45 
		 * mark[1]=56
		 * mark[2]=98
		 * mark[3]=67
		 * mark[4]=78
		 */
		
		String[] mentors= {"gokul","ranjini","vinoth"};
		
		//array instantion
		int[] ages=new int[5];
		ages[0]=23;//18
		ages[1]=34;//23
		ages[2]=18;//34
		
		//find length array
		//length-property
		
		int length = mark.length;
		System.out.println("total size of array :"+length);
		
		//print the first index
		System.out.println("print the first index :"+mark[0]);
		
		//print the last index
		System.out.println("print the last index :"+mark[length-2]);
		
		//sort array
		Arrays.sort(mark);
		
		for (int i = 0; i < mark.length; i++) {
			System.out.println(mark[i]);
		}
		
	}

}
