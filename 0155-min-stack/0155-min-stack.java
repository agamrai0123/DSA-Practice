class MinStack {
    Stack<Long> st;
    long min;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int value) {
        Long val = Long.valueOf(value);
        if(st.isEmpty()){
            min = val;
            st.push(val);
        } else if (val > min){
            st.push(val);
        } else {
            st.push(2L*val - min);
            min = val;
        }
    }
    
    public void pop() {
        if(st.isEmpty()) return;
        long res = st.pop();
        if(res < min){
            min = 2L*min - res;
        }
    }
    
    public int top() {
        if(st.isEmpty()) return -1;
        long res = st.peek();
        if(res > min) return (int)res;
        else return (int)min;
    }
    
    public int getMin() {
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */