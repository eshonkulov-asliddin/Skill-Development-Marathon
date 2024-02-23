class MyStack {

    Queue<Integer> q1;
    
    public MyStack() {
        this.q1 = new LinkedList();
    }
    
    public void push(int x) {
        this.q1.add(x);
    }
    
    public int pop() {
        int size = this.q1.size();
        
        for (int i = 0; i < size - 1; i++) {
            this.q1.add(this.q1.remove());
        }
        
        return this.q1.remove();
    }
    
    public int top() {
        int size = this.q1.size();
        
        for (int i = 0; i < size - 1; i++) {
            this.q1.add(this.q1.remove());
        }
        
        Integer res = this.q1.remove();
        this.q1.add(res);
        return res;
    }
    
    public boolean empty() {
        return this.q1.size() == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

/*
LIFO

q1 = [1, 2, 3]
*/