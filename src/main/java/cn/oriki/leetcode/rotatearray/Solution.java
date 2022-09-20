package cn.oriki.leetcode.rotatearray;

/**
 * <a href="https://leetcode.cn/problems/rotate-array/">189. 轮转数组</a>
 */
public class Solution {

    public void rotate(int[] nums, int k) {
        // 注释内容显示会存在超过数组长度的移动。
        k = k % nums.length;

        reserve(nums, 0, nums.length - 1);
        reserve(nums, 0, k - 1);
        reserve(nums, k, nums.length - 1);
    }

    private static void reserve(int[] nums, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            int temp = nums[startIndex];
            nums[startIndex++] = nums[endIndex];
            nums[endIndex--] = temp;
        }
    }

}
// 38 / 38 个通过测试用例
// 状态：通过
// 执行用时: 0 ms
// 内存消耗: 57.3 MB