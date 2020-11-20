package LeetCode.排序;

/**
 * 给定一个列表funds表示投资人每次的投资额。现在有三个公司A, B, C,它们的初始资金分别为a,b,c。
 * 投资人每次投资时会对当前资金最少的公司进行投资（当有多个公司资金相同时，投资人会对编号最小的公司进行投资）。返回A, B, C三家公司最后的资金。
 */
public class Investment_result {
    public int[] getAns(int[] funds, int a, int b, int c) {
        // Write your code here
        int[] result = new int [3];
        for(int i = 0; i < funds.length; i++){
            if (a == get_min(a, b, c)) a = a + funds[i];
            else if (b == get_min(a, b, c)) b = b + funds[i];
            else if (c == get_min(a, b, c)) c = c + funds[i];
        }
        result[0] = a;
        result[1] = b;
        result[2] = c;
        return result;
    }
    public static int get_min(int a, int b, int c){
        if (a <= b && a <= c)return a;
        else if (b < a && b <= c) return b;
        else return c;
    }

    public static void main(String[] args) {
        System.out.println(get_min(9,3,3));
    }
}
