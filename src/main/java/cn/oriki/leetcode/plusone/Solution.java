package cn.oriki.leetcode.plusone;

/**
 * <a href="https://leetcode.cn/problems/plus-one/">66. 加一</a>
 */
public class Solution {

    /**
     * 从后往前，出现的第一个不为 9 的数字，将该数 +1，并将之后的数字全部修改为 0
     * <p>
     * 但如果整个数字全部由 9 组成，则需要进位 1，并将原来是 9 的数字改成 0
     */
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; --i) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        int[] ints = new int[digits.length + 1];
        ints[0] = 1;
        return ints;
    }

}
// 111 / 111 个通过测试用例
// 状态：通过
// 执行用时: 0 ms
// 内存消耗: 40.2 MB