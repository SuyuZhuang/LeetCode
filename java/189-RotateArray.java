// 最简单直接的方法
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (k>n)
            k = k % n;
        int[] ans = new int[n];
        for (int i=0; i<k; i++){
            ans[i] = nums[n-k+i];
        }
        for (int i=0; i<n-k;i++){
            ans[i+k] = nums[i];
        }
        System.arraycopy(ans,0,nums,0,n);
    }
}
