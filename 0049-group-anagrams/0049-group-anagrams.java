class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            String key = sort(s);
            List<String> list = map.getOrDefault(key, new ArrayList());
            list.add(s);
            map.put(key, list);
        }
        
        return new ArrayList<>(map.values());
        
    }
    
    private String sort(String s) {
        char[] chars = s.toCharArray();
        
        Arrays.sort(chars);
        
        return new String(chars);
    }
}