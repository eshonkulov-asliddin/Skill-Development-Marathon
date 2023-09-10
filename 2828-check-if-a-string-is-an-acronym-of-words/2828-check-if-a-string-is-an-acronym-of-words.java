class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder str = new StringBuilder();
        
        for (String word : words) {
            char firstLetter = word.charAt(0);
            str.append(String.valueOf(firstLetter));
        }
        
        return str.toString().equals(s);
        
    }
}