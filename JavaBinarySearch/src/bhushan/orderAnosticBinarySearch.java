package bhushan;
import java.util.Arrays;
public class orderAnosticBinarySearch {
		public static void main(String[] args) {
			int[]arr= {89,43,23,22,22,22,97,12};
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
			System.out.println(binarySearch(arr,97));

		}

		private static int binarySearch(int[] arr, int target) {
			
			int start=0;
			int end=arr.length-1;

			boolean isAscending=arr[start]<arr[end];
			while(start<=end) {
				int mid=start+(end-start)/2;
				if(target==arr[mid]) {
					return mid;
				}
				if(isAscending) {
					if(target<arr[mid]) {
						end=mid-1;
					}
					else {
						start=mid+1;
					}
				}
				else {
					if(target>arr[mid]) {
						end=mid-1;
					}
					else {
						start=mid+1;
					}
				}
				
			}
			return -1;
		}

	}

