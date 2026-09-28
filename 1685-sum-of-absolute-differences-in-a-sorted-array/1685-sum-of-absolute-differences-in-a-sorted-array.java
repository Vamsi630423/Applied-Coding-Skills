class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {

        int n = nums.length;
        int total = 0;
        int leftsum = 0;

        int[] ans = new int[n];

        // Find total sum of all elements
        for (int num : nums) {
            total += num;
        }

        for (int i = 0; i < n; i++) {

            int left = i * nums[i] - leftsum;

            int right = (total - leftsum - nums[i])
                        - (n - i - 1) * nums[i];

            ans[i] = left + right;

            leftsum += nums[i];
        }

        return ans;
    }
}