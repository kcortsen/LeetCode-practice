import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int result = 0;

        int halfNums = nums.length / 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
            if (map.get(n) > halfNums) {
                result = n;
            }
        }
        return result;
    }
}
