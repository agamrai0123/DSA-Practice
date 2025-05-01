func sortColors(nums []int)  {
    low := 0
    high := len(nums) -1
    curr := 0
    for curr <= high{
        if nums[curr] == 0{
            nums[low], nums[curr] = nums[curr], nums[low]
            low++
            curr++
        } else if nums[curr] == 2{
            nums[high], nums[curr] = nums[curr], nums[high]
            high--
        } else {
            curr++
        }
    }
}

// func swap(nums []int, i, j int) {
//     // temp := nums[i]
//     // nums[i] = nums[j]
//     // nums[j] = temp
//     nums[i], nums[j] = nums[j], nums[i]
// }