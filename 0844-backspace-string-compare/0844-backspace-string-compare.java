class Solution {
    
    public boolean backspaceCompare(String s, String t) {
        
    /*
        
        Time Complexity: O(n)
        Space Complexity: O(n)

    */
        
        String sAfterOpt = applyOperation(s);
        String tAfterOpt = applyOperation(t);
        
        return sAfterOpt.equals(tAfterOpt);
        
    }
    
    public String applyOperation(String s){
        
        Stack<Character> stack = new Stack();
        
        for (char character : s.toCharArray()){
            
            if (character == '#' && !stack.isEmpty()) {
                stack.pop();
                continue;
            }else if (character == '#'){
                continue;
            }
            
            stack.add(character);
        }
        StringBuilder strBuilder = new StringBuilder();
        
        for (char ch : stack) {
            strBuilder.append(ch);
        }
        
        return strBuilder.toString();
    }
}