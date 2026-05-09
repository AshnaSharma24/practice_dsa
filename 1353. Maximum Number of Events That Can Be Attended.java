class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a,b) -> a[0]-b[0]);    // sort acc to start days

        int lastday = 0;
        for(int[] e : events) lastday = Math.max(lastday,e[1]); // find the total days

        PriorityQueue<Integer> pq = new PriorityQueue<>(); // add end date of events minheap so soon ending events 1st 

        int i = 0;  // event pointer
        int attend = 0; // answer

        for(int d=1; d<=lastday; d++){                      // loop over each day
            while(!pq.isEmpty() && pq.peek()<d) pq.poll();  // if event alredy ended cant attend remove  
            while(i < events.length && events[i][0] <= d){
                pq.add(events[i][1]);                        // Add all events that have started
                i++;
            }
            if(!pq.isEmpty()){
                pq.poll();                                  // attend 1 event that end earlist
                attend++;                                   // inc attend count
            }

        }
        return attend;
    }
}