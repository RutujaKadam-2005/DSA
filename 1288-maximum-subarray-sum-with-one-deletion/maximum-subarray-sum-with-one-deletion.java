class Solution {
    public int maximumSum(int[] arr) {
        int nopow=arr[0];
        int pow=arr[0];
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            int a1=arr[i];
            int a2=nopow+arr[i];
            int a3=pow+arr[i];
            int a4 =nopow;
            nopow=Math.max(a1,a2);
            pow=Math.max(a3,a4);
            res=Math.max(res,Math.max(nopow,pow));
        }
        return res;
    }
}