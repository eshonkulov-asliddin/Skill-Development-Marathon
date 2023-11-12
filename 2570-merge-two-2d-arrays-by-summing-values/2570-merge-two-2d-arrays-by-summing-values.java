class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        
        List<List<Integer>> merged = new ArrayList<>();
        
        int p1 = 0, p2 = 0, n = nums1.length, m = nums2.length;
        
        while(p1 < n && p2 < m) {
            int id1 = nums1[p1][0], val1 = nums1[p1][1];
            int id2 = nums2[p2][0], val2 = nums2[p2][1];
            
            // condition
            if (id1 == id2){
                merged.add(List.of(id1, val1+val2));
                p1++;
                p2++;
            }else if (id1 < id2){
                merged.add(List.of(id1, val1));
                p1++;
            }else{
                merged.add(List.of(id2, val2));
                p2++;
            }
        }
        
        
        while (p1 < n){
            int id1 = nums1[p1][0], val1 = nums1[p1][1];
            merged.add(List.of(id1,val1));
            p1++;
        }
        
        while (p2 < m){
            int id2 = nums2[p2][0], val2 = nums2[p2][1];
            merged.add(List.of(id2,val2));
            p2++;
        }
        
        int[][] res = new int[merged.size()][2];
        
        int i = 0;
        for (List<Integer> list : merged){
            res[i][0] = list.get(0);
            res[i][1] = list.get(1);
            i++;
        }
        
        return res;
        
        
    }
}

/*
    
    T: O(n+m)
    S: O(n+m)
    
*/