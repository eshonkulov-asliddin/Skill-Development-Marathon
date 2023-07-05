class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        int n = A.length;
        int[] C = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++){
            if (setB.contains(A[i])){
                count++;
            }
            setA.add(A[i]);

            if (setA.contains(B[i])){
                count++;
            }
            setB.add(B[i]);

            C[i] = count;
        }
        return C;
    }
}