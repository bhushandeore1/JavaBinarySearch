package bhushan;
//You have n coins and you want to build a staircase with these coins. The staircase consists of k
//rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.
//
//Given the integer n, return the number of complete rows of the staircase you will build.
//
//Input: n = 5
//Output: 2
//Explanation: Because the 3rd row is incomplete, we return 2.

public class ArrangingCoinsLeetcode441 {
	public static void main(String[] args) {
		System.out.println(arrangeCoins(5));
		System.out.println(arrangecoins(1804289383));

	}

	//Bruteforce approach
	private static int arrangeCoins(int n) {
		int i=1;//this is the first row of the staircase
		while(n>=i) {
			n=n-i; 
			i++;
		}
		return i-1;
	}
	
	//optimised solution for the binary search way
	public static int arrangecoins(int n) {
		long start=0;
		long end=n;
		while(start<=end) {
			long mid=start+(end-start)/2;
			long tem=mid*(mid+1)/2;
			if(tem==n) {
				return (int) mid;
			}
			else if(tem>n) {
				end=mid-1;

			}
			else {
				start=mid+1;
			}
		}
		return (int) end;
		
	}

}
