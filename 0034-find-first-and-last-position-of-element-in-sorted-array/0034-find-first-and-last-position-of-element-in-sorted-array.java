class Solution {
    public int[] searchRange(int[] nums, int target) {
        int floor = findOccurence(nums, target, false);
        int ceil = findOccurence(nums, target, true);
        return new int[] {floor, ceil};
    }

    public int findOccurence(int[] arr, int x, boolean last) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if(x == arr[mid]){
                ans = mid;
                if(last){
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else if(x > arr[mid]){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}