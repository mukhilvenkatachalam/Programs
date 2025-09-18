
class Solution {
  public:
    vector<int> getAlternates(vector<int> &arr) {
        vector<int> num;
        for(int i=0;i<arr.size();i++){
            if (i%2==0) num.push_back(arr[i]);
        }
        return num;
    }
};
