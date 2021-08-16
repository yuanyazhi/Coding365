import java.util.*;

public class Solution_bk2 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param s string字符串
     * @param k int整型
     * @return string字符串
     */
    public String NS_String (String s, int k)  {
        // write code here
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(Character c:s.toCharArray()){
            set.add(c);
        }
        Iterator it = set.iterator();
        String[] strs = new String[set.size()];
        for(int i=0;i< set.size();i++){
            strs[i] = it.next().toString();
        }
        Arrays.sort(strs);
        for(int i=0;i<k;i++){
            s = s.replaceAll(strs[i],"");
        }
        return s;
    }

    public static void main(String[] args) {
        Solution_bk2 s = new Solution_bk2();
        String r = s.NS_String("aaddbbcc",2);
        System.out.println(r);
    }
}
