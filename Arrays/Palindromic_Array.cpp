class Solution {
  public:
    bool isPalinArray(vector<int> &arr) {
        for(int i=0;i<arr.size();i++){
            int x,y=0,n;
            n= arr[i];
            while (n != 0) {
                x = n % 10;
                y = y * 10 + x;
                n /= 10;
            }
            if (arr[i]==y)
                continue;
            else
                return false;
                
    }
    return true;}
};
