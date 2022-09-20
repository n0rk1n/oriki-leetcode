package cn.oriki.leetcode.removeduplicatesfromsortedarray;

/**
 * <a href="https://leetcode.cn/problems/remove-duplicates-from-sorted-array/">26. 删除有序数组中的重复项</a>
 */
public class Solution {

    /**
     * 双指针
     * 如果 index 指向的内容和 i 指向的内容相同，继续；
     * 如果不相等，将 index++ 后将 i 指向的内容复制到 index 中，最终 index + 1 的结果就是数组的长度，即返回值。
     */
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[index] != nums[i]) {
                index++;
                nums[index] = nums[i];
            }
        }
        return index + 1;
    }

}
// 361 / 361 个通过测试用例
// 状态：通过
// 执行用时: 0 ms
// 内存消耗: 43.3 MB