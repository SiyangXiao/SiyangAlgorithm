package LeetCode.Hash;

import java.util.*;

/**
 * 所有DNA由一系列缩写为A，C，G和T的核苷酸组成，例如：“ACGAATTCCG”。 在研究DNA时，有时识别DNA中的重复序列是非常必要的。
 *
 * 编写一个函数来查找DNA分子中，长度为10个字母的，不止一次出现的序列（子串）。
 */

public class repeatDNA1335 {

    public int encode(String s){
        int sum = 0;
        for (int i = 0 ;i < s.length(); i++){
            if (s.charAt(i) == 'A'){
                sum = sum * 4;
            }else if (s.charAt(i) == 'C'){
                sum = sum * 4 + 1;
            }else if (s.charAt(i) == 'G'){
                sum = sum * 4 + 2;
            }else{
                sum = sum * 4 + 3;
            }
        }
        return sum;
    }

    public List<String> findRepeatedDnaSequences(String s) {
        // write your code here
        List<String> result = new ArrayList<>();
        Set<Integer> hash = new HashSet<>();
        Set<String> dna = new HashSet<>();
        for (int i = 9; i < s.length(); i++){
            String subString = s.substring(i - 9, i + 1);
            int encoded = encode(subString);
            if (hash.contains(encoded)){
                dna.add(subString);
            }else{
                hash.add(encoded);
            }
        }
        for (String d : dna){
            result.add(d);
        }
        return result;
    }

    public List<String> findRepeatedDnaSequences2(String s) {
        // write your code here
        List<String> result = new ArrayList<>();
        if (s == null || s.length() <= 10) return result;
        Set<String> dna3 = new HashSet<>();
        Set<String> dna2 = new HashSet<>();
        List<String> dna = new ArrayList<>();
        for (int i = 9; i < s.length(); i ++){
            String subString = s.substring(i - 9, i + 1);
            dna.add(subString);//all substrings
        }
        for(String d : dna){
            dna2.add(d);//substrings found at least 1 time
        }
        for (String d : dna2){
            dna.remove(d);//substrings found more than 1 time
        }
        for (String d : dna){
            dna3.add(d);
        }
        for (String d : dna3){
            result.add(d);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        //result.add("a");
        System.out.println(result);

    }
}
