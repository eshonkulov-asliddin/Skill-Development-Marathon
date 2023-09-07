class Solution {
    
    /*
        Time Complexity: O(n)
        Space Complexity: O(1)   
    */
    
    
    public int minOperations(String[] logs) {
        
        int pointer = 0;
        
        for (String log : logs) {
            if (log.equals("./")){
                continue;
            }else if (log.equals("../")){
                pointer -= pointer > 0 ? 1 : 0;
            }else{
                pointer++;
            }
        }
        
        return pointer;
        
    }
}