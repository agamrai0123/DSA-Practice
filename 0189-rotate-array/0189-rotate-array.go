func rotate(nums []int, k int)  {
    n:= len(nums)
    k = k%n

    reverse(nums, 0, n-1)
    reverse(nums, 0, k-1)
    reverse(nums, k, n-1)

}
func reverse(nums[]int, i, j int){
    for i<=j{
        temp := nums[i]
        nums[i]=nums[j]
        nums[j]=temp
        i++
        j--
    }
}