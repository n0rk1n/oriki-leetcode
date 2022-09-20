package cn.oriki.leetcode.besttimetobuyandsellstockii;

/**
 * <a href="https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii/">122. 买卖股票的最佳时机 II</a>
 */
public class Solution {

    /**
     * 处理隔天的差值，为正的就算入利润中。
     */
    public int maxProfit(int[] prices) {
        // 利润
        int x = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > min) {
                x += prices[i] - min;
            }
            min = prices[i];
        }
        return x;
    }

}
// 200 / 200 个通过测试用例
// 状态：通过
// 执行用时: 0 ms
// 内存消耗: 41.4 MB