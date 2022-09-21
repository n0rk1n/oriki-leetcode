package cn.oriki.leetcode.validsudoku;

/**
 * <a href="https://leetcode.cn/problems/valid-sudoku/">36. 有效的数独</a>
 */
public class Solution {

    /**
     * 设置三个哈希表，分别对应元素所在行、所在列、所在方格的情况是否存在
     * <p>
     * 如果不存在，修改哈希表对应数据存在并继续
     * 如果存在，则数独非法
     * <p>
     * 时间复杂度 O(9 * 9)
     */
    public boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[9][10];
        int[][] columns = new int[9][10];
        int[][] squares = new int[9][10];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    int c1 = c - 48; // ASCII(0) = 48
                    if (exists(rows, i, c1)) return false;
                    if (exists(columns, j, c1)) return false;
                    if (exists(squares, switchArray(i, j), c1)) return false;
                }
            }
        }
        return true;
    }

    /**
     * 初始数组为 0，出现 1 次 +1，当出现两次时非法
     */
    private boolean exists(int[][] arrays, int i, int j) {
        return ++arrays[i][j] > 1;
    }

    /**
     * 简化后的选取方格的方法
     * <p>
     * 举例：
     * 如果 i == 0，j == 0，则落在九宫格的 0 号方格内
     * 如果 i == 4，j == 4，则落在九宫格的 4 号方格内
     * 如果 i == 0，j == 8，则落在九宫格的 6 号方格内
     */
    private int switchArray(int i, int j) {
        return i / 3 * 3 + j / 3;
    }

}
// 507 / 507 个通过测试用例
// 状态：通过
// 执行用时: 1 ms
// 内存消耗: 41.5 MB