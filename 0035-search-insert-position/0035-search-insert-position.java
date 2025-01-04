class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        int mid = 0;
        if(target > nums[high]) return high + 1;
        if(target < nums[low]) return 0;
        while(low <= high){
            mid = (high + low) / 2;
            if(nums[mid] >= target){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if(ans == -1) return mid;
        return ans;
    }
}