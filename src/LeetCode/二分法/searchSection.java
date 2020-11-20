package LeetCode.二分法;

/**
 * 给定一个包含 n 个整数的排序数组，找出给定目标值 target 的起始和结束位置。
 *
 * 如果目标值不在数组中，则返回[-1, -1]
 */
public class searchSection {
    public int[] searchRange(int[] A, int target) {
        // write your code here
        int [] a = new int[2];
        if (A.length == 0){
            a[0] = -1;
            a[1] = -1;
            return a;
        }
        int mid = 0;
        int left = 0;
        int right = A.length - 1;
        int leftSection = 0;
        int rightSection = A.length - 1;

        while (left + 1 < right){
            mid = left + (right - left) / 2;
            if (A[mid] < target){
                left = mid;
            }else{
                right = mid;
            }
        }
        if (A[left] == target){
            mid = left;
        }else{
            mid = right;
        }

        if (A[mid] != target){
            a[0] = -1;
            a[1] = -1;
            return a;
        }
        int midLeft = mid;//确立左右边界
        int midRight = mid;
        left = 0;
        right = A.length - 1;
        while (left + 1 < mid){//lift boundary
            midLeft = left + (mid - left) / 2;
            if (A[midLeft] < target){
                left = midLeft;
            }else{
                mid = midLeft;
            }
        }
        if (A[left] == target){
            a[0] = left;
        }else{
            a[0] = mid;
        }
        mid = midRight;//right boundary
        while (mid + 1 < right){
            midRight = mid + (right - mid) / 2;
            if (A[midRight] > target){
                right = midRight;
            }else{
                mid = midRight;
            }
        }
        if (A[right] == target){
            a[1] = right;
        }else {
            a[1] = mid;
        }
        return a;
    }
}
