class CustomQueue {
    
    public List<Integer> list = new ArrayList<>();
    public int pointer = 0;
    
    public void push(int x) {
        list.add(x);
    }
    
    public int peek() {
        return this.list.get(pointer);
    }
    
    public int remove() {
        return this.list.get(pointer++);
    }
    
    public boolean isEmpty() {
        return this.list.size() - this.pointer == 0;
    }
    
    public int size() {
        return this.list.size() - pointer;
    }
    
}

class MyStack {

    CustomQueue q1; CustomQueue q2;
    
    public MyStack() {
        this.q1 = new CustomQueue();
        this.q2 = new CustomQueue();
    }
    
    public void push(int x) {
        if (!this.q1.isEmpty()) {
            this.q1.push(x);
        }else {
            this.q2.push(x);
        }
    }
    
    public int pop() {
        if (!this.q1.isEmpty()) {
            while(this.q1.size() > 1) {
                this.q2.push(q1.remove());
            }   
            
            return this.q1.remove();
        } else {
            while(this.q2.size() > 1) {
                this.q1.push(q2.remove());
            }   
            
            return this.q2.remove();
        }
    }
    
    public int top() {
        if (!this.q1.isEmpty()) {
            while(this.q1.size() > 1) {
                this.q2.push(q1.remove());
            }   
            
            int res = this.q1.remove();
            this.q2.push(res);
            return res;
        } else {
            while(this.q2.size() > 1) {
                this.q1.push(q2.remove());
            }  
            
            int res = this.q2.remove();
            this.q1.push(res);
            return res;
        }
    }
    
    public boolean empty() {
        return Math.max(this.q1.size(), this.q2.size()) == 0;
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

q1 = []
q2 = [3, 2]
*/