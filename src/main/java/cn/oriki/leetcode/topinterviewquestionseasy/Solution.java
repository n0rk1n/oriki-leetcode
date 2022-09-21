package cn.oriki.leetcode.topinterviewquestionseasy;

/**
 * <a href="https://leetcode.cn/problems/rotate-image/">48. 旋转图像</a>
 */
public class Solution {

    /**
     * 两次反转，水平 + 主对角线
     */
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // 水平翻转
        for (int i = 0; i < n / 2; ++i) {
            for (int j = 0; j < n; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - i - 1][j];
                matrix[n - i - 1][j] = temp;
            }
        }
        // 主对角线翻转
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

}
// 21 / 21 个通过测试用例
// 状态：通过
// 执行用时: 0 ms
// 内存消耗: 40.4 MB