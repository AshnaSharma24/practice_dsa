class Solution {
    public int leastInterval(char[] tasks, int n) {
        int N = tasks.length;
        int freq [] = new int[26];
        for(char t  :  tasks) freq[t - 'A']++;  // freq of each task
        Arrays.sort(freq);                      // ascending
        int maxf = freq[25];                    // higest freq helps in determining the gaps
        int gap = maxf - 1;                     // gap btw 2 same tasks
        int slots = gap * n;                    // each gap has how many places to fill
        for(int i=24; i>=0; i--) slots -= Math.min(gap,freq[i]);    // bz in 1 gap only 1 slot can be filled so min taken
        return slots <= 0 ? N : N+slots;      // if 0 then N utilised else N+remaining slots
    }
}