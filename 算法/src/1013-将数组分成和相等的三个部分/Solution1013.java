class Solution1013 {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for(int a:arr){
            sum+=a;
        }
        if(sum%3!=0) return false;
        int target = sum/3;
        int i=1, j=arr.length-2;
        int lsum=arr[0], rsum=arr[arr.length-1];
        while(i<j){
            if(lsum!=target){
                lsum+=arr[i++];
            }
            if(rsum!=target){
                rsum+=arr[j--];
            }
            if(lsum==target && rsum==target && j-i>=0){
                return true;
            }
        }
        return false;
    }
}