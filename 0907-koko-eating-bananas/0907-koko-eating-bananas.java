class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        // Find the maximum number of bananas in a pile
        for (int pile : piles) {
            if (pile > max)
                max = pile;
        }

        int l = 1; // Minimum possible speed
        int r = max; // Maximum possible speed
        int result = max; // Store the minimum speed found

        while (l <= r) {
            int mid = l + (r - l) / 2; // Avoid overflow
            if (canEatAll(piles, h, mid)) {
                result = mid; // Update result as we found a feasible speed
                r = mid - 1; // Try lower speeds
            } else {
                l = mid + 1; // Try higher speeds
            }
        }

        return result;
    }
    private boolean canEatAll(int[] piles, int h, int k) {
        long hoursNeeded = 0; // Use long to handle large sums
        for (int pile : piles) {
            hoursNeeded += (pile + k - 1) / k; // Equivalent to Math.ceil((double)pile / k)
            if (hoursNeeded > h) {
                return false; // Early exit if we exceed allowed hours
            }
        }
        return true;
    }
}