//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String str = br.readLine();
                    Solution ob = new Solution();
                    System.out.println(ob.transform(str));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String transform(String s)
    {
        // code here
        StringBuffer sb=new StringBuffer();
        char[] sarr=new char[s.length()];
        boolean caps=true;
        sarr=s.toCharArray();
        for(int i=0;i<sarr.length;i++){
            if(sarr[i]==' ')
                caps=true;
            else if(caps==true){
                sarr[i]=Character.toUpperCase(sarr[i]);
                caps=false;
            }
            sb.append(sarr[i]);
        }
        return sb.toString();
    }
}