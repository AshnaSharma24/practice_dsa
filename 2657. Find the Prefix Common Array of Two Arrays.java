// way 1 = using sets
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int res [] = new int[n];
        Set<Integer> sa = new HashSet<>();
        Set<Integer> sb = new HashSet<>();
        int com = 0;                        // count common ele
        for(int i=0; i<n; i++){
            sa.add(A[i]);                   // add ith of a in set a
            if(sb.contains(A[i])) com++;    // if a[i] is in setb too com++

            sb.add(B[i]);                   //add ith of b in set b
            if(sa.contains(B[i])) com++;   // Count only if: present in A a
            res[i] = com;   // store ans at ith postion
        }
        return res;
    }
}


// ========================================================
// way 2 = using freq arrays 
class Solution {

    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] ans = new int[n];
        int[] freq = new int[n + 1];
        int com = 0;

        for (int i=0; i<n; i++) {
            freq[A[i]]++;                    // Add current element from A
            if (freq[A[i]] == 2) com++;      // If freq == 2, means ele appeared in both arrays

            freq[B[i]]++;                    // Add current element from A
            if (freq[B[i]] == 2) com++;

            ans[i] = com;                    // Store current common count
        }
        return ans;
    }
}