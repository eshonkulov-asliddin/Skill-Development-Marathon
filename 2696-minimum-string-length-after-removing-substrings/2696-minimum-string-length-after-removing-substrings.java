class Solution {
    public int minLength(String s) {
        
        Stack<Character> stack = new Stack();
        
        for (char character : s.toCharArray()){
            
            if (stack.isEmpty()){
                stack.add(character);
                continue;
            }
            
            if (character == 'B' && stack.peek() == 'A'){
                stack.pop();
            }else if (character == 'D' && stack.peek() == 'C'){
                stack.pop();
            }else {
                stack.add(character);
            }
        }
        
        return stack.size();
    }
}