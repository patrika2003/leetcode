class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
      int n,i,sum=0,j;
       n=nums.size();
       for(i=0;i<=n-1;i++)
       {
         for(j=i+1;j<=n-1;j++)
            {
                sum = nums[i]+nums[j];
                if (sum==target)
                {
                    return {i,j};
                    
                }
            }
       }
       return{-1,-1};
    }
};