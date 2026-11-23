class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        List<Boolean> bool_candies = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if((candies[i]+extraCandies)>=max){
                bool_candies.add(true);
            }
            else{
                bool_candies.add(false);
            }
        }
        return bool_candies;
    }
}