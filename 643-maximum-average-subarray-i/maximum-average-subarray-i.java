class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int currentWindowSum = 0;
        for (int i = 0; i < k; i++) {
            currentWindowSum += nums[i];
        }
        
        int maxWindowSum = currentWindowSum;
        
        for (int i = k; i < nums.length; i++) {
            currentWindowSum += nums[i] - nums[i - k];
            maxWindowSum = Math.max(maxWindowSum, currentWindowSum);
        }
        return (double) maxWindowSum / k;
        
    }
}