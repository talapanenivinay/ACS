class Solution {
    public void sortColors(int[] nums) {

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        // Count 0s, 1s and 2s
        for (int num : nums) {
            if (num == 0) {
                count0++;
            } else if (num == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        int i = 0;

        // Put 0s
        while (count0 > 0) {
            nums[i++] = 0;
            count0--;
        }

        // Put 1s
        while (count1 > 0) {
            nums[i++] = 1;
            count1--;
        }

        // Put 2s
        while (count2 > 0) {
            nums[i++] = 2;
            count2--;
        }
    }
}
