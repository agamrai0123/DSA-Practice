func twoSum(nums []int, target int) []int {
    numMap := make(map[int]int)
    for i, num := range nums {
        comp := target - num
        ind, found := numMap[comp]
        if found {
            return []int{ind,i}
        }
        numMap[num] = i
    }
    return nil
}