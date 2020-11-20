package LeetCode.二分法;

/**
 * 给定一个排序的整数数组（升序）和一个要查找的整数target，用O(logn)的时间查找到target第一次出现的下标（从0开始），如果target不存在于数组中，返回-1
 */
public class BinarySearch {
    public int binarySearch(int[] nums, int target){
        int n = nums.length / 2;
        int n0 = n;
        while(nums[n] != target){
            if (nums[n] > target){
                n /= 2;
            }else{
                n0 /= 2;
                n = n + n0;
            }
        }

        if (n == 0 && nums[n] != target){
            return -1;
        }
        if (nums[n] == target && n ==0){
            return n;
        }
        if (nums[n] == target && nums[n - 1] != target){
            return n;
        }else{
            while (nums[n] == target){
                n--;
            }
        }
        return n + 1;
    }

    public int binarySearch2(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while (left < right) {
            //得到中间位置
            mid = (right + left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (nums[right] == target) {
            return right;
        }
        return -1;
    }
}
