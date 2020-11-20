package LeetCode.二分法;

public class findPeak {
    public int findPeak(int[] A) {
        // write your code here
        int left = 0;
        int right = A.length - 1;
        int middle = 0;
        while (left < right - 1){
            middle = left + (right - left) / 2;
            if (A[middle] > A[middle - 1] && A[middle] > A[middle + 1]) {
                return middle;
            }else if (A[middle] > A[middle - 1] && A[middle] < A[middle + 1]){//move right
                left = middle;
            }else{//move left
                right = middle;
            }
        }
        return 0;
    }
}
