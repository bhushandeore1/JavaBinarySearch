package bhushan;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArrayInGivenOrder {

	public static void main(String[] args) {
		int[]nums= {0,1,2,3,4};
		int []index= {4,1,2,3,0};
		System.out.println(Arrays.toString(createTargetArray(nums,index)));

	}
	public static int[] createTargetArray(int[] nums, int[] index) {
		 ArrayList<Integer> arrlist = new ArrayList<Integer>(nums.length-1);
	        int [] ans=new int [nums.length-1];
	        for(int i=0;i<nums.length;i++){
	            arrlist.add(index[i],nums[i]);
	        }
	        System.out.print(arrlist);
	        return ans;
    }

}
