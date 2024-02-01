class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        // map
        Map<Character, Character> open = new HashMap<>();
        open.put('(', ')');
        open.put('{', '}');
        open.put('[', ']');
        
        for (char ch : s.toCharArray()) {
            
            if (open.containsKey(ch)) {
                stack.add(ch);
            } else{
                
                if (stack.size() > 0) {
                    char bracket = stack.pop();
                    
                    if (open.get(bracket) != ch) {
                        return false;
                    }
                }else{
                    return false;
                }
            }
            
        }
        
        return stack.size() == 0;
        
    }
}

/*

*/