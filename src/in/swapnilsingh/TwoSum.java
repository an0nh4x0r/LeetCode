package in.swapnilsingh;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        boolean found = false;
        for (int row = 0; row < nums.length; ++row) {
            for (int col = 0; col < nums.length; ++col) {
                if (row != col && nums[row] + nums[col] == target) {
                    result[0] = row;
                    result[1] = col;
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        return result;
    }

}
