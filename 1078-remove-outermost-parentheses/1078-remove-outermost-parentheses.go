func removeOuterParentheses(s string) string {
    res := ""
    ind := 0
    for _, ch := range s {
        if ch == '('{
            if ind > 0{
                res = res + string(ch)
            }
            ind++
        } else if ch == ')'{
            ind--
            if ind > 0{
                res = res + string(ch)
            }
        }
    }
    return res
}