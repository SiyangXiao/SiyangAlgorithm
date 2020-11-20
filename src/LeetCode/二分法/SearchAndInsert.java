package LeetCode.二分法;

/**
 * 给定一个排序数组和一个目标值，如果在数组中找到目标值则返回索引。如果没有，返回到它将会被按顺序插入的位置。
 * 你可以假设在数组中无重复元素。
 */
public class SearchAndInsert {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a/2);
    }
    public int searchInsert(int[] A, int target) {
        // write your code here
        if(A == null || A.length == 0){return 0;}
        int left = 0;
        int right = A.length - 1;
        int mid = 0;
        if (A[right] == target){
            return right;
        }
        while (left < right){
            mid = (left + right) / 2;
            if (A[mid] < target){
                left = mid + 1;
            }else if (A[mid] > target){
                right = mid;
            }else{
                return mid;
            }
        }

        if (A[right] > target && right != 0){
            return right;
        }
        if (right == 0){
            return 0;
        }
        if (A[right] < target){
            return right + 1;
        }
        return 0;
    }
}
