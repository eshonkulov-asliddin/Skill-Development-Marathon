class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder word = new StringBuilder();
        
        for (char ch : s.toCharArray()) {
            
            if (Character.isLetter(ch) || Character.isDigit(ch)){
                word.append(ch);
            }
        }
        
        String original = word.toString();
        String reversed = word.reverse().toString();
        
        System.out.println(word);
        System.out.println(reversed);
        
        return original.equalsIgnoreCase(reversed);
        
    }
}