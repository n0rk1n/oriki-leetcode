package cn.oriki.leetcode.twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.cn/problems/two-sum/">1. 两数之和</a>
 */
public class Solution {

    /**
     * hash，遍历一次数据，没找到就放入，
     * 在以后的遍历中，出现 target - 遍历元素 = hash 中存在的情况，可以直接返回。
     * <p>
     * 比暴力破解的 O(n^2) 效率提高不少。
     */
    public int[] twoSum(int[] nums, int target) {
        // key - 数据，value - 数组下标
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (map.get(target - nums[i]) != null) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

}
// 57 / 57 个通过测试用例
// 状态：通过
// 执行用时: 1 ms
// 内存消耗: 41.5 MB
