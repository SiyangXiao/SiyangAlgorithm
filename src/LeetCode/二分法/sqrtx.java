package LeetCode.二分法;

public class sqrtx {
    public static int sqrt(int x){
        if(x == 1) return 1;
        double i = 0;
        double left = 0;
        double right = x;
        while(left < right - 1){
            i = left + (right - left) / 2;
            if (i * i > x){
                right = i;
            }else if (i * i == x){
                return (int)i;
            }else{
                left = i;
            }
        }
        return (int)i;
    }

    public static void main(String[] args) {
        int i = sqrt(100000000);
        System.out.println(i);
        double a = 31622.9;
        System.out.println((int)a);
    }
}
