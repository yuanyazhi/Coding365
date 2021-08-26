package tx.tx5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int res = m.solution(map);
        System.out.println(res);
    }
    public int solution(Map<Integer, Integer> map){
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){

        }
        return 0;
    }
}
