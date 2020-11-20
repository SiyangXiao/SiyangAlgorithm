package LeetCode.排序;

import java.util.HashMap;

public class twoSum56 {
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        // 假设数组[a,b,c,d,e]且target = c + e，遍历数组到c时，把 target - c 即 e 与当前 i（c 的位置）为一组放入 map
        //遍历到 e 时，识别出 e 已在之前放入 map，将 get.map(e) 即 get.map(当前 i ) （结果为 c 的位置）与 当前 i 放入一组并输出。
        int [] result = {0, 0};
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++){
            if (map.get(numbers[i]) != null){//如果map中有当前值，说明之前已将target - 当前值的数值加入map
                                            // ，返回map.get[当前值](即target - 当前值所在数组中的位置)和当前i的集合
                int[] res = new int[2];
                res[0] = map.get(numbers[i]);
                res[1] = i;
                return res;
            }
            map.put(target - numbers[i], i);//如果map中无当前值，说明当前值未被遍历到，把target - numbers[i]以及位置i加入map
        }
        return result;
    }

    public int[] twoSum2(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] result = {0,0};
        for(int i=0;i<numbers.length;i++){
            // 查找是否存在满足一个数+nums[i]==target
            if(map.get(numbers[i])!=null){
                int[] res = {map.get(numbers[i]),i};
                return res;
            }
            map.put(target-numbers[i],i);
        }
        return result;
    }
}
