/**
 * @author xiaoweii
 * @create 2026-03-07 09:37
 */
public class LeetCode_0485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxRes = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                maxRes = Math.max(maxRes, count);
                count = 0;
            }
        }
        maxRes = Math.max(maxRes, count);
        return maxRes;
    }
}
