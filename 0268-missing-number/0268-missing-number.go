func missingNumber(nums []int) int {
    n := len(nums)
    sum := (n * (n+1))/2
    s := 0
    for _, num := range nums{
        s = s + num
    }
    return sum - s
}