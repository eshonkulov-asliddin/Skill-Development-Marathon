/*
    Time Complexity: O(n)
    Space Complexity: O(n)   

*/

class Solution {
    public String removeDuplicates(String s, int k) {
        
        Stack< Pair<Character, Integer> > stack = new Stack();
        
        for (char character : s.toCharArray()) {
            
            if (stack.isEmpty()) {
                stack.add(new Pair(character, 1));
                
            } else {
                char key = stack.peek().getKey();
                int occur = stack.peek().getValue();
                
                if (character == key) {
                    stack.pop();
                    stack.add(new Pair(key, occur + 1));
                    
                    if (occur + 1 == k){
                        stack.pop();
                    }
                }else {
                    stack.add(new Pair(character, 1));
                }
                
                
            }
        }
        
        StringBuilder ans = new StringBuilder();
        
        while (!stack.isEmpty()){
            Pair<Character, Integer> pair = stack.pop();
            
            char key = pair.getKey();
            int occur = pair.getValue();
            
            for (int i = 0; i < occur; i++){
                ans.append(key);   
            }
        }
        return ans.reverse().toString();
        
    }
}