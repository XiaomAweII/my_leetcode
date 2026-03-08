/**
 * @author xiaoweii
 * @create 2026-03-05 23:44
 */
public class LeetCode_0026 {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int numsLength = nums.length;
        int res = 0;
        for (int i = 0; i < numsLength; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                nums[res] = nums[i];
                res++;
            }
        }
        return res;
    }
}
