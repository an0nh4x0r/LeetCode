package in.swapnilsingh;

import java.util.Arrays;

public class KthLargestNumberinArray {
}

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}