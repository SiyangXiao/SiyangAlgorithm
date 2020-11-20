package LeetCode.二分法;

/**假设有一个排序的按未知的旋转轴旋转的数组(比如，0 1 2 4 5 6 7 可能成为4 5 6 7 0 1 2)。给定一个目标值进行搜索，
 * 如果在数组中找到目标值返回数组中的索引位置，否则返回-1。你可以假设数组中不存在重复的元素。
 *
 */
public class SearchRotateQueueArray {
    public int search(int[] A, int target) {
        // write your code here
        if (A.length == 0) return -1;//empty array
        /*if (A.length == 1) {
            if (A[0] == target) {
                return 0;
            }else{
                return -1;
            }
        }*/
        //find smallest num
        int minposition = 0;
        int left = 0;
        int right = A.length - 1;
        int mid = 0;
        while (left + 1 < right){
            mid = left + (right - left) / 2;
            if (A[mid] > A[right]){
                left = mid;
            }else{
                right = mid;
            }
        }
        if (A[left] < A[right]){
            minposition = left;
        }else{
            minposition = right;
        }
        //determine which scale target may in
        if (A[A.length - 1] < target){
            left = 0;
            right = minposition - 1;
        }else{
            left = minposition;
            right = A.length - 1;
        }
        //find position
        while (left + 1 < right) {
            mid = left + (right - left) / 2;
            if (A[mid] > target) {
                right = mid;
            } else{
                left = mid;
            }
        }
        if (A[left] == target) return left;
        if (A[right] == target) return right;
        return -1;
    }




    public int search2(int[] A, int target){
        if (A == null || A.length == 0) {
            return -1;
        }
        //找到数组最小值位置minPosition，即第二个数组的起始位置
        int minPosition = 0;
        int left = 0;
        int right = A.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (A[mid] > A[right]) {
                left = mid;
            } else {
                right = mid;
            }
        }
        if (A[left] < A[right]) {
            minPosition = left;
        } else {
            minPosition = right;
        }

        //判断target在哪一个数组中
        if (A[A.length - 1] < target) {
            left = 0;
            right = minPosition - 1;
        } else {
            left = minPosition;
            right = A.length - 1;
        }

        //对target所在数组二分搜索
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (A[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }

        if (A[left] == target) {
            return left;
        }
        if (A[right] == target) {
            return right;
        }
        return -1;
    }
}
