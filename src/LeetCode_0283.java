/**
 * @author xiaoweii
 * @create 2026-03-05 23:54
 */
public class LeetCode_0283 {
    public void moveZeroes(int[] nums) {
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[flag] = nums[i];
                flag++;
            }
        }
        for (int i = flag; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
