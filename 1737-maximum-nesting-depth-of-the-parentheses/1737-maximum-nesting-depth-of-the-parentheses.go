func maxDepth(s string) int {
    maxNest:=0
    ind:=0
    for _, ch := range s{
        if ch == '('{
            ind++
            if maxNest < ind{
                maxNest = ind
            }
        } else if ch == ')'{
            ind--
        }
    }
    return maxNest
}