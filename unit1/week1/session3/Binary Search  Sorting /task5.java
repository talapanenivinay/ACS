class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

         int sum = 0;

        // Total sum
        for (int num : nums) {
            sum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {

            int rightSum = sum - leftSum - nums[i];

            int left = nums[i] * i - leftSum;

            int right = rightSum - nums[i] * (n - i - 1);

            result[i] = left + right;

            leftSum += nums[i];
        }

        return result;
    }
}
