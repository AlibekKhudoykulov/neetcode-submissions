class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int temp = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                temp++;
            } else {
                if (result <= temp) {
                    result = temp;
                }
                temp = 0;
            }
        }

        return result >= temp ? result : temp;
    }
}