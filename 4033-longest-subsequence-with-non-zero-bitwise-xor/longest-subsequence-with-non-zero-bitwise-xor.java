class Solution {
    public int longestSubsequence(int[] nums) {
        int totalXor = 0, nonZeros = 0;
        for (int num : nums) {
            totalXor ^= num;
            if (num != 0) nonZeros++;
        }
        return nonZeros == 0 ? 0 : (totalXor != 0 ? nums.length : nums.length - 1);
    }
}