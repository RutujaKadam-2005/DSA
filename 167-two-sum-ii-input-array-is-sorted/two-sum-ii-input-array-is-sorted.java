class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lp=0,rp=numbers.length-1;
        while(lp<rp){
            int currSum=numbers[lp]+numbers[rp];
            if(currSum==target){
                return new int[] {lp + 1, rp + 1}; 
            }else if(currSum<target){
                lp++;
            }else{
                rp--;
            }

        }
        return new int[0];
    } 
}