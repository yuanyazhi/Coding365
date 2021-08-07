class Solution4_2 {
    // 双指针 i,j
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            int[] tmp = nums2;
            nums2 = nums1;
            nums1 = tmp;
        }
        int m = nums1.length, n = nums2.length;
        // 处理一个数组为空的情况
        if(m==0) return (double)(nums2[(n)/2]+nums2[(n-1)/2])/2;
        if(n==0) return (double)(nums1[(m)/2]+nums1[(m-1)/2])/2;
        int i = 0, j = 0, c=0;
        int pre = 0, cur = 0;
        // c达到总长一半时停止遍历
        while(c<=(m+n+1)/2){
            pre = cur;
            if(i==m){
                cur = nums2[j];
                j++;
                c++;
                continue;
            }
            if(j==n){
                cur = nums1[i];
                i++;
                c++;
                continue;
            }
            if(nums1[i]>nums2[j]){
                cur = nums2[j];
                j++;
            }else{
                cur = nums1[i];
                i++;
            }
            c++;
        }
        return (m+n)%2==0 ? (double)(pre+cur)/2 : pre;
    }

    public static void main(String[] args) {
        int[] a = {1,2};
        int[] b = {3,4};
        Solution4_2 s = new Solution4_2();
        System.out.println(s.findMedianSortedArrays(a,b));
    }
}