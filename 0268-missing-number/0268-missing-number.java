class Solution {
    public int missingNumber(int[] nums) {
        int m = 0; 
        Arrays.sort(nums);
        for (int i = 0; i < nums.length  ; i++) {
            if (nums[i]==m) {
                m++;
            }
            else return m ; 
        }
        return m ; 
    }
}
