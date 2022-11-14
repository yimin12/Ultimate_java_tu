package AGenius.Algorithm.DataStructure.Stack.monotonousStack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Description
 * Given n non-negative integers representing the histogram's bar height where the width of each bar is 1, find the area
 * of largest rectangle in the histogram.
 * Example:
 *  Input: height = [2,1,5,6,2,3]
 *  Output: 10
 */
public class LargestRectangleHistogram {

    /**
     * Monotonous Increasing Stack
     * Space: O(n) worst case
     * Time: O(n)
     * @param height
     * @return
     */
    public int largestRectangleArea_ms(int[] height) {
        // Assumptions: input is not null and its length is greater than 1
        if (height == null || height.length <= 1) return 0;
        int res = 0;
        // Note: this stack store the index of the array
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i <= height.length; i ++) {
            // we need a way of popping out all the elements in the stack, so we explicitly add a bar of height 0
            int cur = i == height.length ? 0 : height[i];
            while (!stack.isEmpty() && height[stack.peekFirst()] >= cur) {
                int h = height[stack.pollFirst()];
                // determine the left boundary
                int left = stack.isEmpty() ? 0 : stack.peekFirst() + 1;
                res = Math.max(res, h * (i - left));
            }
            stack.offerFirst(i);
        }
        return res;
    }

    /**
     * maintain two index, so we need 2 dimension array -- matrix
     * Time: O(n^2)
     * Space: O(n)
     * 物理意义:
     *      dp[i][j] means the min value between index i and j for array A
     *      induction rule: dp[i][j] = min[dp[i][j-1], A[j])
     *      res = dp[i][j] * (j - i + 1)
     *      1. optimization: right now the space complexity is O(n^2)
     *         we can use two pointer by index i and j (maintained by for loop), and just keep the min value
     *         So we do not have to info of left boundary and right boundary by matrix index
     *         Thus, it can be optimized to O(n)
     * @param height
     * @return
     */
    public int largestRectangleArea_dp(int[] height) {
        if (height == null || height.length == 0) return 0;
        int n = height.length, res = 0, dp[] = new int[n];
        // initialization
        for (int i = 0; i < n; i ++) {
            dp[i] = height[i];
        }
        for (int i = 0; i < n; i ++) {
            for (int j = i; j < n; j ++) {
                dp[i] = Math.min(dp[i], height[j]);
                res = Math.max(res, dp[i] * (j - i + 1));
            }
        }
        return res;
    }
}
