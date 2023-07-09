# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
import random

class Solution:

    def __init__(self, head: Optional[ListNode]):
        self.head = head;
        self.size = self.getSize(head)

    def getRandom(self) -> int:
        random_num = random.randint(1, self.size + 1)
        node = self.head
        counter = 1
        while (counter != random_num and node.next != None):
            counter += 1
            node = node.next       
        return node.val
    
    def getSize(self, head):
        cur = head
        count = 0
        while cur:
            count += 1
            cur = cur.next
        return count     
        


# Your Solution object will be instantiated and called as such:
# obj = Solution(head)
# param_1 = obj.getRandom()