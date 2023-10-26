class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<>();

        for (String word : words){
            String[] splitted = word.split("[" + separator + "]");
            for (String splittedWord : splitted){
                if (splittedWord.length() >= 1){
                    res.add(splittedWord);
                }
            }
        }

        return res;
    }
}

/**
    Time Complexity: O(n + m) m is the length of String arr after splitting
    Space Complexity: O(n)
 */