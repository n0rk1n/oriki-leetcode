package cn.oriki.leetcode.intersectionoftwoarraysii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/intersection-of-two-arrays-ii/">350. 两个数组的交集 II</a>
 */
public class Solution {

    /**
     * 排序 + 双指针，滑动指针对比
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> list = new ArrayList<>();

        int index1 = 0, index2 = 0;
        while (index1 < nums1.length && index2 < nums2.length) {
            if (nums1[index1] < nums2[index2]) {
                index1++;
            } else if (nums1[index1] > nums2[index2]) {
                index2++;
            } else {
                list.add(nums1[index1]);
                index1++;
                index2++;
            }
        }

        int[] ints = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ints[i] = list.get(i);
        }
        return ints;
    }
}
// 56 / 56 个通过测试用例
// 状态：通过
// 执行用时: 2 ms
// 内存消耗: 41.8 MB