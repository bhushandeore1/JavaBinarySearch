package bhushan;
public class mySqrt {

	public static void main(String[] args) {
		System.out.println(FindSqrt(323232323));

	}

	private static int FindSqrt(int x) {
		int start=0;
		int end=x;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(mid==x/mid) {
				return mid;
			}
			else if(mid>x/mid){
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return end;
	}

}