/*
    Time Complexity: O(n)
    Space Complexity: O(n);
*/
class Solution {
    public String makeGood(String s) {
        
        Stack<Character> stack = new Stack();
        
        for (char character : s.toCharArray()){
            
            if (stack.isEmpty()){
                stack.add(character);
                continue;
            }
            
            char peek = stack.peek();
            
            boolean isPeekLowerCase = Character.isLowerCase(peek);
            boolean isCurCharLowerCase = Character.isLowerCase(character);
            
            boolean isValid = !(isPeekLowerCase == isCurCharLowerCase);
            boolean isEqual = Character.toLowerCase(peek) == Character.toLowerCase(character);
            
            if (isValid && isEqual) {
                stack.pop();
                
            }else {
                stack.add(character);
            }
            
        }
        
        StringBuilder str = new StringBuilder();
        while (!stack.isEmpty()){
            str.append(stack.pop());
        }
        
        return str.reverse().toString();
        
    }
}