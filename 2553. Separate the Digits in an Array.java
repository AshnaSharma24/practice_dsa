class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<>();            // built to sort new numbers
        for(int n : nums){                                      // loop over each number in nums
            for(char c : String.valueOf(n).toCharArray()){      // convert each into string to get each digit
                temp.add(c-'0');                                // add each digit into list (char -> int)
            }
        }
        int[] result = new int[temp.size()];                    // result array to return 
        for(int i=0; i<temp.size(); i++){
            result[i] = temp.get(i);                            // put digits in an array 
        }
        return result;
    }
}