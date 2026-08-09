class Solution {
    public int removeElement(int[] nums, int val) {
        int lp = 0;
        int rp = nums.length;
        while (lp < rp) {
            if (nums[lp] == val) {
                nums[lp] = nums[rp - 1];
                rp--; 
            } else {
                lp++;
            }
        }
        return lp;        
    }
        
}
