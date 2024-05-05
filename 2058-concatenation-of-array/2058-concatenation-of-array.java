class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length-1;
        int l=2*nums.length - 1;
        int[] res=new int[l+1];
        while(n>=0){
            res[n]=nums[n];
            res[l]=nums[n];
            n--;
            l--;
        }
        return res;
    }
}