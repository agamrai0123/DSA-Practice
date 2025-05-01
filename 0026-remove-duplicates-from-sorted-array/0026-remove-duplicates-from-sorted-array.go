func removeDuplicates(nums []int) int {
    n := len(nums)
    j := 1
    for i := 1; i< n; i++{
        if nums[i] != nums[i-1]{
            nums[j] = nums[i]
            j++
        }
    }
    return j
}