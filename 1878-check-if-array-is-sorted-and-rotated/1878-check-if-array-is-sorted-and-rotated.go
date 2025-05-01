func check(nums []int) bool {
    n := len(nums)
    c := 0
    for i, _ := range nums{
        curr := nums[i]
        next := nums[(i+1+n)%n]
        if next < curr{
            c++
        }
    }
    if c > 1 {
        return false
    }
    return true
}