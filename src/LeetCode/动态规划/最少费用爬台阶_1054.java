package LeetCode.动态规划;

/**
 * 在楼梯上，每一号台阶都有各自的费用，即第 i 号台阶有非负成本cost [i]（台阶从0号索引）。
 *
 * 一旦你支付了费用，你可以爬一到两步。 你需要找到最低成本来到达最高层，你可以从索引为0的楼梯开始，也可以从索引为1的楼梯开始。
 */
public class 最少费用爬台阶_1054 {
    public static int minCostClimbingStairs(int[] cost) {
        // Write your code here
        int [] dp = new int[cost.length + 1];//dp[i]为从开始上到第i阶的最小费用
        dp[0] = 0;
        dp[1] = 0;//可以从第0步或第1步开始，所以第一步可为0
        for (int i = 2; i < dp.length; i++){
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[cost.length];
    }
}
