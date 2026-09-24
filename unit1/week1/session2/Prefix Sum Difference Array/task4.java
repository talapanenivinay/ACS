class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        int totalSum = 0;

        // Find total sum
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {

            int leftCount = i;
            int rightCount = n - i - 1;

            int leftPart = nums[i] * leftCount - leftSum;

            int rightPart = (totalSum - leftSum - nums[i])
                            - nums[i] * rightCount;

            result[i] = leftPart + rightPart;

            leftSum += nums[i];
        }

        return result;
    }
}
