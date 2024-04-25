//{ Driver Code Starts


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int[] ans = ob.AllPrimeFactors(N);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends






class Solution
{
    public int[] AllPrimeFactors(int n)
    {
        List<Integer> pf = new ArrayList<>();
        if (n != 0) {
            for (int i = 2; i <= n; i++) {
                while (n % i == 0) {
                    pf.add(i);
                    n /= i;
                }
            }
        }
        if (n > 1) {
            pf.add(n);
        }
        Collections.sort(pf);
        Set<Integer> newset=new LinkedHashSet<Integer>(pf);
        
        Integer[] newarr=newset.toArray(new Integer[newset.size()]);
        int[] intarr = Arrays.stream(newarr).mapToInt(Integer::intValue).toArray();
        return intarr;
    }
}

