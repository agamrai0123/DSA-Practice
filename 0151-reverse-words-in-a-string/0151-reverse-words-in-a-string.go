func reverseWords(s string) string {
    res := ""
    arr := strings.Fields(s)
    for _, w := range arr{
        res = w + " " + res
    }
    return strings.TrimSpace(res)
}