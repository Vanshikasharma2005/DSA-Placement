import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        // Store the final answer
        List<List<Integer>> ans = new ArrayList<>();

        // Step 1: Sort the array
        Arrays.sort(nums);

        int n = nums.length;

        // Step 2: Choose one number as the leader
        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate leaders
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Two pointers
            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                // Triplet found
                if (sum == 0) {

                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicate left values
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    // Skip duplicate right values
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    // Move both pointers
                    left++;
                    right--;
                }

                // Sum is too small
                else if (sum < 0) {
                    left++;
                }

                // Sum is too large
                else {
                    right--;
                }
            }
        }

        return ans;
    }
}