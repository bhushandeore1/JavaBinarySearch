package bhushan;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6,80,5,3,1};
//		System.out.println(findPivot(arr));
		System.out.println(searchInRotated(arr,6));

	}
	
	

	private static int searchInRotated(int[] arr, int target) {
		int pivot=findPivot(arr);
		if(pivot==-1) {
			return binarySearch(arr,target,0,arr.length-1);
		}
		if(arr[pivot]==target) {
			return pivot;
		}
		if(target>=arr[0]){
			return binarySearch(arr,target,0,pivot-1);
		}
		return binarySearch(arr,target,pivot+1,arr.length-1); 
		
	}



	private static int binarySearch(int[] arr, int target, int start, int end) {
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==target) {
				return mid;
			}
			if(arr[mid]>target) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return -1;
	}



	private static int findPivot(int[] arr) {
		int start=0;
		int end=arr.length-1;
		int ans=0;
		while(start<end) {
			int mid=start+(end-start)/2;
			if(arr[mid+1]>arr[mid]) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		return start;
	}

}
