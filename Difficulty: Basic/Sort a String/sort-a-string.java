//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while(t-- > 0){
            String s = sc.nextLine().trim();
            Solution obj = new Solution();
            System.out.println(obj.sort(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String sort(String s) 
    {
        // code here
        String st="";
        char[] str=s.toCharArray();
        Arrays.sort(str);
        for(char c:str){
            st=st+c;
            // System.out.println(st);
        }
        return st;
    }
} 