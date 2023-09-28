class Solution:
    def separateDigits(self, nums: List[int]) -> List[int]:
        ans = []
        for num in nums:
            curDigits = []
            while num:
                remainder = num % 10
                curDigits.append(remainder)
                num //= 10
            ans.extend(curDigits[::-1]) 
        
        return ans
    
"""
    Time Complexity: O(n)
    Space Complexity: O(n)
    
    n is the number of digits within an array

"""
    