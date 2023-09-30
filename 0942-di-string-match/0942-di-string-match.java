class Solution {
    public int[] diStringMatch(String s) {
        int length = s.length();
        int[] permutation = new int[length+1];
        
        int min = 0, max = length;
        
        int i = 0;
        while (i < length) {
            char curChar = s.charAt(i);
            
            if (curChar == 'I'){
                permutation[i] = min++;
            }else{
                permutation[i] = max--;
            }
            
            i++;
        }
        
        permutation[i] = min;
        
        return permutation;
        
    }
}

/*
 Time Complexity: O(n)
 Space Complexity: O(n) if we consider result array

*/