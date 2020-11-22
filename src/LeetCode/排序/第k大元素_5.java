package LeetCode.排序;

import java.util.Arrays;

/**
 * 在数组中找到第 k 大的元素。
 */
public class 第k大元素_5 {
    public static int kthLargestElement(int n, int[] nums){
        Arrays.sort(nums);
        return nums[nums.length - n];
    }
}
