
class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    
    public MinStack() {
        
        this.stack = new Stack<>();   
        this.minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.add(val);
        
        Integer currMin = null;
        try {
            currMin = minStack.peek();
        }catch (Exception e) {
            
        }
        if (currMin != null) {
            minStack.add(Math.min(val, currMin));
        }else{
            minStack.add(val);
        }
        
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
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