package LeetCode.Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * 给定一个整型数组，找到主元素，它在数组中的出现次数严格大于数组元素个数的1/k。
 */
public class mainElement48 {

    public int majorityNumber(List<Integer> nums, int k) {
        // write your code here
        //
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = nums.size()/k + 1;
        Iterator it = nums.iterator();
        while(it.hasNext()){
            int temp = (int)it.next();
            if (map.containsKey(temp)){
                int m = (int)map.get(temp) + 1;
                map.put(temp, m);
                if (m >= count) return temp;
            }else{
                map.put(temp, 1);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        List l = new ArrayList();
        l.add("aa");
        l.add("bb");
        l.add("cc");
        for (Iterator iter = l.iterator(); iter.hasNext();) {
            String str = (String)iter.next();
            System.out.println(str);
        }
        Iterator iter = l.iterator();
        while(iter.hasNext()){
            String str = (String) iter.next();
            System.out.println(str);
        }
    }
}
