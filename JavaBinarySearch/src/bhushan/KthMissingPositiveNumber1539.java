package bhushan;

public class KthMissingPositiveNumber1539 {

	public static void main(String[] args) {
		int []arr= {2,3,5,9,11};
		int k=4;
		System.out.println(findmissing(arr,k));
	}
	
	public static int findmissing(int []arr,int k) {
		int start=0;
		int end=arr.length;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]-mid-1<k) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		 return start+k;
	}

}
