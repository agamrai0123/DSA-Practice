func isAnagram(s string, t string) bool {
	if len(s) != len(t) {
		return false
	}
	mpC := make(map[rune]int)
	for _, char := range s {
		mpC[char]++
	}
    for _, char := range t{
        if mpC[char] == 0{
            return false
        }
        mpC[char]--
    }
    return true
}