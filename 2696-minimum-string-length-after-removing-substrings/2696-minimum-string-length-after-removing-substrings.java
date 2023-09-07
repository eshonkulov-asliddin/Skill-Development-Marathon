/*
    Time Complexity: O(n);
    Space Complexity: O(n);
*/
class Solution {
    public int minLength(String s) {
        
        Stack<Character> stack = new Stack();
        
        for (char character : s.toCharArray()){
            
            if (stack.isEmpty()){
                stack.add(character);
                continue;
            }
            
            char peek = stack.peek();
            
            if (peek == 'A' && character == 'B'){
                stack.pop();
            }else if (peek == 'C' && character == 'D'){
                stack.pop();
            }else {
                stack.add(character);
            }
        }
        
        return stack.size();
    }
}