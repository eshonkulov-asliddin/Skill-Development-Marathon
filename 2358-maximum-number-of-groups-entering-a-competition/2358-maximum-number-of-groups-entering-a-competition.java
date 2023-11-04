class Solution {
    public int maximumGroups(int[] grades) {
        
        /*
            [10,6,12,7,3,5]
            [3, 5, 6, 7, 10, 12]
            
            i = 
            int prevSum = 0;
            int prevCount = 0;
            int curSum = 3;
            int curCount = 1;
        */
        
        Arrays.sort(grades);
        
        int countGroups = 0;
        int i = 0;
        
        int prevSum = 0;
        int prevCount = 0;
        int curSum = 0;
        int curCount = 0;
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