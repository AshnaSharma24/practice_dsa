class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points, (a,b) ->  Integer.compare(sqDis(a), sqDis(b))); // sort on basis of squared dis from origin
        int result[][] = new int [k][2];                                    
        for(int i=0; i<k; i++) result[i] = points[i];                       // k closest points store
        return result;
    }
    public int sqDis(int point[]){
        return point[0]*point[0] + point[1]*point[1];                       // cal squared dis from origin
    }
}
