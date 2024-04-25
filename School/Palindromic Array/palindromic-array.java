//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends




/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
           {
               int countSum=0;
                for(int num : a)
                    countSum+=reverse(num);
                if(countSum==n)
                    return 1;
                return 0;
           }
    public static int reverse(int no){
        int rev=0,dig,num=no;
        while(num!=0){
            dig=num%10;
            rev=rev*10+dig;
            num/=10;
        }
        if(no==rev)
            return 1;
        return 0;
    }
}