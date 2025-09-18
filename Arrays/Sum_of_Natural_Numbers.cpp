#include <bits/stdc++.h>
using namespace std;
class Solution {
  public:
    int seriesSum(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            count +=i;
        }
        return count;
    }
};
int main() {
    int t;
    scanf("%d ", &t);
    while (t--) {

        int n;
        scanf("%d", &n);

        Solution obj;
        int res = obj.seriesSum(n);

        cout << res << endl;
        cout << "~" << endl;
    }
}
