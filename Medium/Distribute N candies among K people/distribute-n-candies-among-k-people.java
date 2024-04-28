//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            int N = Integer.parseInt(S[0]);
            int K = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            Long[] res = ob.distributeCandies(N,K);
            
            for(int i=0; i<K; i++)
                System.out.print(res[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static Long[] distributeCandies(int candies, int peop) {
        int count=1;
        Long arr[]=new Long[peop];
        Arrays.fill(arr,0L);//L used to store Long value 0;Fill(Long[],long);
        while(candies>0){
            for(int i=0;i<peop && candies>0;i++){
                if(candies-count>0)
                    arr[i]+=(long)count;
                else
                    arr[i]+=(long)candies;
                candies-=count;
                count++;
            }
        }
        return arr;
    }
};