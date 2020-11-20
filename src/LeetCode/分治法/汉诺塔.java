package LeetCode.分治法;

public class 汉诺塔 {
    public static void main(String[] args) {
        System.out.println(calculate(3));
        tower(3, 'a', 'b', 'c');
    }
    public static double calculate(double layer){
        if (layer == 1){
            return 1;
        }else{
            return calculate(layer - 1) * 2 + 1;
        }
    }
    public static void tower(int num, char a, char b, char c){
        if (num == 1){
            System.out.println(a + " -> " + c);
        }else{
            tower(num - 1, a, c, b);
            System.out.println(+ a + " -> " + c);
            tower(num - 1, b, a, c);
        }
    }
}
