class Solution {
    public int maximumGroups(int[] grades) {
        
        Arrays.sort(grades);
                
        int i = 0, prevSum = 0, prevCount = 0, curSum = 0, curCount = 0, countGroups = 0;
        while (i < grades.length) {
            while ((i < grades.length) && 
                   (curSum <= prevSum || curCount <= prevCount)){
                
                curSum += grades[i++];
                curCount++;
            }
            
            if (curSum > prevSum && curCount > prevCount) {
                countGroups++;
                prevSum = curSum;
                prevCount = curCount;
                curSum = 0;
                curCount = 0;   
            }else{
                i++;
            }
            
            
        }
        
        return countGroups;
        
    }
    
}

/*
    Time Complexity: O(n log n)
    Space Complexity: O(1)
    
*/