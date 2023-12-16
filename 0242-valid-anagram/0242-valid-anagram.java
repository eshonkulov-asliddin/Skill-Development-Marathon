class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (t.length() != s.length()) return false;
        
        Map<Character, Integer> freq = new HashMap<>();
        
        // fill map
        for (char ch : s.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        
        // remove occurrences
        for (char ch : t.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch, 2) - 1);
        }
        
        
        
        for (Map.Entry<Character, Integer> entry : freq.entrySet()){
            if (entry.getValue() > 0){
                return false;
            }
        }
        
        return true;
        
    }
    
 
}