class Solution {
    public int maxProduct(int[] nums) {
        int max = 0,n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int prod = (nums[i]-1)*(nums[j]-1);
                if(prod>max){
                    max = prod;
                }
            }
        }
        return max;
    }
}