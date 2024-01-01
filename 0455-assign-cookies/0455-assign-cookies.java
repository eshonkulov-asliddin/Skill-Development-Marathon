class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);
        
        int count = 0;
        
        int gP = 0;
        int sP = 0;
        
        while (gP < g.length && sP < s.length) {
            
            int childGreed = g[gP];
            int cookie = s[sP];
            
            if (cookie >= childGreed) {
                count++;
                gP++;
            }
            sP++;
        }
        
        return count;
        
    }
}

/*
    
    g = [1, 2, 3]
    
*/