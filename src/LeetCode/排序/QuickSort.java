package LeetCode.排序;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};
        int[] arr2 = new int[]{20,7,2,11,10,9,16,19,18,15,2,1,18,74,13,116,5,4,3,0};
        quick2(arr2,0, arr2.length - 1);
        for (int i : arr2){
            System.out.println(i);
        }
    }
    public static void quick(int[] arr, int left, int right){//从小到大
        if (arr == null || arr.length == 0) return;
        if (left >= right) return;
        int key = arr[left];
        int l = left;
        int r = right;
        while(l != r){
            while(arr[r] >= key && l < r){
                r--;
            }
            while(arr[l] <= key && l < r){
                l++;
            }
            //交换arr[l] arr[r]
            if (l < r){
                int tem = arr[l];
                arr[l] = arr[r];
                arr[r] = tem;
            }
        }//while结束后l==r
        arr[left] = arr[l];
        arr[l] = key;
        quick(arr, left, r - 1);//新key指左右部分的数组迭代进行快速排序
        quick(arr, l + 1, right);
    }
    public static void quick2(int[] arr, int left, int right){//从大到小
        if (left >= right) return;
        int key = arr[left];
        int l = left;
        int r = right;
        while(l != r){
            while(arr[r] <= key && l < r){
                r--;
            }
            while(arr[l] >= key && l < r){
                l++;
            }
            if(l < r){//exchange arr[l] arr[r]
                int tem = arr[l];
                arr[l] = arr[r];
                arr[r] = tem;
            }
        }
        //exchange arr[l&r] and key
        arr[left] = arr[l];
        arr[l] = key;
        quick2(arr, left, l-1);
        quick2(arr, r+1, right);
    }
}
