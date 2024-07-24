//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends


class Solution {
    Set<String> set=new HashSet<>();
    public List<String> find_permutation(String S) {
        // Code here
        permutations("",S);
        List<String> pStrings=new ArrayList<>(set);
        Collections.sort(pStrings);
        return pStrings;
    }
    void permutations(String p,String up){
        if(up.isEmpty()){
            set.add(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String first=p.substring(0,i);
            String sec=p.substring(i,p.length());
            permutations(first+ch+sec,up.substring(1));
        }
            
    }
}