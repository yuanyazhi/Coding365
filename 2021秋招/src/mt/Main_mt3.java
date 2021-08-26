package mt;

import java.util.*;

public class Main_mt3 {
    public static void main(String[] args) {
        Main_mt3 mt = new Main_mt3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> cur = new ArrayList<>();
        ArrayList<Integer> dir = new ArrayList<>();
        int[] res = new int[n];
        Arrays.fill(res,-1);
        for(int i=0;i<n;i++){
            cur.add(sc.nextInt());
            dir.add(sc.next().equals("R")?1:-1);
        }
        for(int i=0;i<n;i++){
            res[i] = mt.check(cur, dir, i);
            System.out.println(res[i]);
        }
    }
    public int check(ArrayList<Integer> cur, ArrayList<Integer> dir, int i){

        return 0;
    }
}
