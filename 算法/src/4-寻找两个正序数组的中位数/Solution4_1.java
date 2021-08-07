class Solution4_1 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // O(M+N)，归并数组后查询中位数
        if(nums1==null || nums1.length==0){
            return findMedian(nums2);
        }else if(nums2==null || nums2.length==0){
            return findMedian(nums1);
        }
        int m = nums1.length, n = nums2.length;
        int[] nums = new int[m + n];
        int i=0, j=0, k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                nums[k++] = nums1[i++];
            }else{
                nums[k++] = nums2[j++];
            }
        }
        while(i<m){
            nums[k++] = nums1[i++];
        }
        while(j<n){
            nums[k++] = nums2[j++];
        }
        return findMedian(nums);
    }
    public double findMedian(int[] nums) {
        int n = nums.length-1;
        if(n%2 == 1){
            return (double)(nums[n/2]+nums[n/2+1])/2;
        }else{
            return nums[n/2];
        }
    }
}