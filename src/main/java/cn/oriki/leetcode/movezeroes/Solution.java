package cn.oriki.leetcode.movezeroes;

/**
 * <a href="https://leetcode.cn/problems/move-zeroes/">283. 移动零</a>
 */
public class Solution {

    /**
     * 双指针
     */
    public void moveZeroes(int[] nums) {
        if (nums == null) {
            return;
        }

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }

        // 将剩余位置全部填入 0
        for (int i = count; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

}
// 74 / 74 个通过测试用例
// 状态：通过
// 执行用时: 1 ms
// 内存消耗: 43.1 MB