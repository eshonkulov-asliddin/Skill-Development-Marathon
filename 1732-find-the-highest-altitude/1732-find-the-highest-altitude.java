class Solution {
    public int largestAltitude(int[] gain) {
        
        List<Integer> altitudes = new ArrayList<>();
        
        altitudes.add(0);
        
        int cur = 0;
        for (int net : gain) {
            cur += net;
            altitudes.add(cur);
        }
        
        return Collections.max(altitudes);
    }
}