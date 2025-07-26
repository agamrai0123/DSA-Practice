func findValidPair(s string) string {
    freq := make([]int, 10)
    for _, ch := range s{
        num := ch - '0'
        freq[num]++
    }
    for i:=0; i<len(s)-1; i++{
        d1 := int(s[i] - '0')
        d2 := int(s[i+1] - '0')
        if d1 != d2 && freq[d1] == d1 && freq[d2] == d2{
            return s[i:i+2]
        } 
    }
    return ""
}