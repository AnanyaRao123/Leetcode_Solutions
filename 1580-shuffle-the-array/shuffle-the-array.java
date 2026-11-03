class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                ans[i]=nums[m++];
            }
            else{
                ans[i]=nums[n++];
            }
        }
        return ans;
    }
}