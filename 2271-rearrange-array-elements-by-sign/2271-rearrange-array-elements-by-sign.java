class Solution {
    public int[] rearrangeArray(int[] nums) {
        int neg = 1;
        int pos = 0;
        int n = nums.length;
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            if(nums[i] < 0){
                arr[neg] = nums[i];
                neg = neg+2;
            } else {
                arr[pos] = nums[i];
                pos = pos+2;
            }
        }
        return arr;
    }
}