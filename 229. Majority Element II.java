class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i : nums) map.put(i,map.getOrDefault(i,0)+1);       // freq count
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > n/3) result.add(entry.getKey());  // if > n/3 add to result
        }
        return result;
    }
}