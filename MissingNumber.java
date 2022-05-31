class Solution {
    public int Largest(int[] nums) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest)
                largest = nums[i];
        }
        return largest;
    }

    public int missingNumber(int[] nums) {
        int l = Largest(nums);
        Arrays.sort(nums);
        int i;
        for (i = 0; i <= l; i++) {
            if (nums[i] != i)
                break;
        }
        return i;
    }
}