/**
 * @author xiaoweii
 * @create 2026-03-05 23:52
 */
public class LeetCode_0027 {
    public int removeElement(int[] nums, int val) {
        int numsLength = nums.length;
        int res = 0;
        for (int num : nums) {
            if (num != val) {
                nums[res] = num;
                res++;
            }
        }
        return res;
    }
}
