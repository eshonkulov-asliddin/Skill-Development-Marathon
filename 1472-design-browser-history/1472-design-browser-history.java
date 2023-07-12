class DoublyLinkedList {
    String url;
    DoublyLinkedList next;
    DoublyLinkedList prev;
    
    DoublyLinkedList(){}
    DoublyLinkedList(String url) {this.url = url;}
}

class BrowserHistory {
    
    private DoublyLinkedList list; 

    public BrowserHistory(String homepage) {
        this.list = new DoublyLinkedList(homepage);  
    }
    
    public void visit(String url) {
        DoublyLinkedList next = new DoublyLinkedList(url);
        DoublyLinkedList prev = this.list;
        this.list.next = next;
        this.list = this.list.next;
        this.list.prev = prev;            
    }
    
    public String back(int steps) {
        while(steps > 0){
            if (this.list.prev == null){
                break;
            }
            steps--;
            this.list = this.list.prev;
        }
        return this.list.url;
        
    }
    
    public String forward(int steps) {
        while(steps > 0){
            if (this.list.next == null){
                break;
            }
            steps--;
            this.list = this.list.next;
        }
        return this.list.url; 
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */