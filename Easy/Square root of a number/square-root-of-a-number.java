//{ Driver Code Starts
import java.util.Scanner;

class SquartRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long a = sc.nextInt();
			Solution obj = new Solution();
			System.out.println(obj.floorSqrt(a));
		t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution
{
     long floorSqrt(long x)
	 {
        long ans=1;
        long low,high,mid;
        low=1;high=x/2;
        while(low<=high){
            mid=(low+high)/2;
            if(mid*mid <= x){
                ans=mid;
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return ans;
	 }
}

// 		// Your code here
//      only for perfect square numbers;
// 		for(long i=2;i<=x/2;i++){
// 		    if(x/i == i)
// 		        return i;
// 		}
// 		return 0;