func moveZeroes(nums []int)  {
    j := 0
    for i, num := range nums{
        if num != 0{
            temp := nums[j]
            nums[j] = nums[i]
            nums[i] = temp
            j++
        }
    }
}