//{ Driver Code Starts

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution {
  public:
    int isAmicable(int A , int B) {
        // code here
        int sum1=0,sum2=0;
        for(int i=1;i<A;i++){
            if(A%i==0)
                sum1+=i;
        }
        for(int j=1;j<B;j++){
            if(B%j==0)
                sum2+=j;
        }
        if((sum1==B)&& (sum2==A))
            return 1;
        return 0;
    }
};


//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int A,B;
        
        cin>>A>>B;

        Solution ob;
        cout << ob.isAmicable(A,B) << endl;
    }
    return 0;
}
// } Driver Code Ends