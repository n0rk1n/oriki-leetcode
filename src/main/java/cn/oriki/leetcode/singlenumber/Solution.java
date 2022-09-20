package cn.oriki.leetcode.singlenumber;

/**
 * <a href="https://leetcode.cn/problems/single-number/">136. 只出现一次的数字</a>
 */
public class Solution {

    /**
     * 异或运算，相同数异或两次为 0，只有出现一次的数据会被保留
     */
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }

}
// 61 / 61 个通过测试用例
// 状态：通过
// 执行用时: 1 ms
// 内存消耗: 41.4 MB