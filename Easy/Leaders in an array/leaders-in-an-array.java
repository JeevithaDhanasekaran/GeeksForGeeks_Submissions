//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Array {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter ot = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		
		while(t-->0){
		    
		    //input size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //inserting elements in the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    StringBuffer str = new StringBuffer();
		    ArrayList<Integer> res = new ArrayList<Integer>();
		  
		    //calling leaders() function
		    res = obj.leaders(arr, n);
		    

		    for(int i=0; i<res.size(); i++){
		        ot.print(res.get(i)+" ");
		    }
		    
		    ot.println();
		}
		ot.close();
		
	}
}

// } Driver Code Ends




class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> leads=new ArrayList<Integer>();
        if(n==1)
        leads.add(arr[n-1]);
        else{
            int lead=-1;
            // leads.add(lead);
            for(int i=n-1;i>=0;i--){
                if(arr[i]>=lead){
                    lead=arr[i];
                    leads.add(lead);
                }
            }
            Collections.reverse(leads);
        }
        return leads;
    }
}
