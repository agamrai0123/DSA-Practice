func findMaxConsecutiveOnes(nums []int) int {
    count := 0
    max := int(math.Inf(-1))
    for _, num := range nums{
        if num == 1{
            count++
        } else {
            count = 0
        }
        if count > max{
            max = count
        }
    }
    return max
}