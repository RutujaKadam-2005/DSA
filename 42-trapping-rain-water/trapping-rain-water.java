class Solution {
    public int trap(int[] height) {
       int n = height.length;
      
       int ans = 0;
       int lmax = height[0];  
       int rmax = height[n - 1];  
       int low = 1;  
       int high = n - 2;  


       while (low <= high) {
           lmax = Math.max(lmax, height[low]);
           rmax = Math.max(rmax, height[high]);


           if (lmax < rmax) {
               ans += lmax - height[low];
               low++;
           } else {
               ans += rmax - height[high];
               high--;
           }
       }
       return ans;
   }
        
    
}