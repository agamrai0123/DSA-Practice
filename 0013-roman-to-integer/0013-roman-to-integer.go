func romanToInt(s string) int {
    values := map[rune]int{'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
    sum := 0
    for i, ch := range s{
        if i+1 < len(s) && values[ch] < values[rune(s[i+1])]{
            sum = sum - values[ch]
        } else {
            sum = sum + values[ch]
        }
    }
    return sum
}