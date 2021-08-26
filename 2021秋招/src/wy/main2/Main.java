package wy.main2;

import java.util.HashMap;
import java.util.Map;

import java.util.*;


public class Main {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 返回Sn的第k位字符
     * @param n int整型 Sn的n
     * @param k int整型 需要返回的字符下标位
     * @return char字符型
     */
    Map<Character, Character> map = new HashMap<>();
    public char findKthBit (int n, int k) {
        for(int i=0;i<26;i++){
            map.put((char) ('a'+i),(char)('z'-i));
        }
        String str = findKthS(n);
        System.out.println((n)+" "+str);
        return str.charAt(k-1);
    }
    public String findKthS(int n){
        if(n==1) return "a";
        else{
            String t = findKthS(n-1);
            System.out.println((n-1)+" "+t);
            return t + (char)('a'+n-1) + new StringBuilder(invert(t)).reverse().toString();
        }
    }
    public String invert(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            sb.append(map.get(str.charAt(i)));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.findKthBit(4,11);
    }
}