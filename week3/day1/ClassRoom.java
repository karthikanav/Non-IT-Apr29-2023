package week3.day1;

import java.util.Arrays;

public class ClassRoom {

	public static void main(String[] args) {
		
		int[] nums = {2, 5, 7, 7, 5, 9, 2, 3};
		//0-7
		//2,2,3,5,5,7,7,9
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length; i++) {
			//2==2
			//7==7+1
			if(nums[i]==nums[i+1]) {
				System.out.println(nums[i+1]);
			}
		}
	}

}
