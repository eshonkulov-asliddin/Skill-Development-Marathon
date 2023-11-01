class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        ROWS, COLS = len(grid), len(grid[0])
        seen = set()

        def dfs(row, col):
            
            if (row < 0 or row >= ROWS or col < 0 or col >= COLS or (row, col) in seen or grid[row][col] == 0):
                return 0

            seen.add((row, col))    

            return (1 + dfs(row, col - 1) +
                        dfs(row, col + 1) +
                        dfs(row - 1, col) +
                        dfs(row + 1, col)) 
        maxArea = 0
        for row in range(ROWS):
            for col in range(COLS):
                if (grid[row][col] == 1):
                    maxArea = max(dfs(row, col), maxArea)
        
        return maxArea            
