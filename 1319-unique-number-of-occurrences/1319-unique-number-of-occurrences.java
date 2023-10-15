class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> valOccurr = new HashMap<>();

        // map num to its occurrences
        for (int num : arr) {
            valOccurr.put(num, valOccurr.getOrDefault(num, 0) + 1);
        }

        Set<Integer> occurrences = new HashSet<>();

        for (Map.Entry<Integer, Integer> entry : valOccurr.entrySet()){
            int occurrence = entry.getValue();
            if (occurrences.contains(occurrence)){
                return false;
            }
            occurrences.add(occurrence);
        }

        return true;

    }
}

/**
    Time Complexity: O(n)
    Space Complexity: O(n)
 */