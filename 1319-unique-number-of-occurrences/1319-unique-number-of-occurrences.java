class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> freq = new HashMap<>();

        // map num to its occurrences
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        Set<Integer> occurrences = new HashSet<>();
        // iterate map and check repeated occurrences
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()){
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