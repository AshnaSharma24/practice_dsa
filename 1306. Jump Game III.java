// BFS solution

class Solution {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        boolean vis[] = new boolean[n];                // visit array
        Queue<Integer> q = new ArrayDeque<>();         // stores ind to process
        q.offer(start);                                // start BFS from given index
        while(!q.isEmpty()){
            int i = q.poll();                          // current index
            if(i<0 || i>=n || vis[i]) continue;        // invalid or already visited
            vis[i] = true;                             // mark visited
            if(arr[i] == 0) return true;               // found 0
            // possible jumps enqueue
            q.offer(i + arr[i]);
            q.offer(i - arr[i]);
        }
        return false;
    }
}




//===========================================================================================

// DFS solution

class Solution {
    public boolean canReach(int[] arr, int start) {
        if(start < 0 || start >= arr.length || arr[start] < 0)  return false;  // invalid index or already visited
        if(arr[start] == 0) return true;                                       // found value 0
        arr[start] = - arr[start];                                            // mark current index as visited
        return canReach(arr, start + arr[start]) || canReach(arr, start - arr[start]); // try both possible jumps
    }
}