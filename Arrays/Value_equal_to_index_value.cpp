class Solution {
  public:
    vector<int> valueEqualToIndex(vector<int>& arr) {
        int al =arr.size();
        vector<int> nums2;
        for(int i=0;i<al;i++){
            if(arr[i]==(i+1)) {
                nums2.push_back(arr[i]);
            }
        }
        return nums2;
    }
};
