class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR operation will cancel out duplicate numbers and leave the single number
        }
        return result;
    }
}
