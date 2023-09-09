class Solution {
    
    /*
    
    Time Complexity: O(n)
    Space Complexity: O(n+m)
    
    
    */
    
    public int countStudents(int[] students, int[] sandwiches) {
        
        int count = 0;
        Queue<Integer> allStudents = this.getAllStudents(new LinkedList<>(), students);
        Stack<Integer> allSandwiches = this.getAllSandwiches(new Stack(), sandwiches);
        
        
        while (!allStudents.isEmpty() && count <= allStudents.size()){
            int student = allStudents.peek();
            int sandwich = allSandwiches.peek();
            
            if (student == sandwich){
                allStudents.poll();
                allSandwiches.pop();
                count = 0;
            }else{
                allStudents.add(allStudents.poll());
                count++;
            }
            
        }
        
        return allStudents.size();
        
    }
    
    public Queue<Integer> getAllStudents(Queue<Integer> queue, int[] students){
        for (int num : students){
            queue.add(Integer.valueOf(num));
        }
        
        return queue;
    }
    
    public Stack<Integer>  getAllSandwiches(Stack<Integer> stack, int[] sandwiches){
        for (int i = sandwiches.length - 1; i >= 0; i--){
            stack.add(Integer.valueOf(sandwiches[i]));
        }
        
        return stack;
    }
}
