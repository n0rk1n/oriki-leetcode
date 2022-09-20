package cn.oriki.leetcode.containsduplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.cn/problems/contains-duplicate/">217. 存在重复元素</a>
 */
public class Solution {

    /**
     * 将数据存入 hashTable 中，如果存在，则插入失败
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            if (!set.add(x)) {
                return true;
            }
        }
        return false;
    }

}
// 70 / 70 个通过测试用例
// 状态：通过
// 执行用时: 6 ms
// 内存消耗: 49.8 MB