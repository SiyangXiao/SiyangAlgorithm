package LeetCode.排序;

import java.util.Arrays;

/**
 * 给定一个未排序的整数数组，找到其中位数。
 *
 * 中位数是排序后数组的中间值，如果数组的个数是偶数个，则返回排序后数组的第N/2个数。
 */
public class 中位数_80 {
    public static void main(String[] args) {
        System.out.println(5/2);
    }
    public static int median(int[] nums){
        Arrays.sort(nums);
        if (nums.length % 2 == 0) return nums[nums.length / 2 - 1];
        return nums[nums.length / 2];
    }
}
