public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < nums.length; i++) {
            num1 = nums[i];
            for (int j = 0; j < nums.length; j++) {
                num2 = nums[j];
                if (num1 + num2 == target) {
                    if (i != j) {
                        result[0] = i;
                        result[1] = j;

                    }
                }
            }
        }
        return result;
    }
}
