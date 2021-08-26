package xhs;

import java.util.*;

public class Main_xhs1 {
    public static void main(String[] args) {
        Main_xhs1 main = new Main_xhs1();
        int res = main.solution();
        System.out.println(res);
    }
    public int solution(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N%2 != 0) return -1;
        int res = 0, white = 0, black = 0;
        ArrayList<int[]> costs = new ArrayList<>();
        for(int i=0;i<N;i++){
            int next = sc.nextInt();
            if(next==1) white++;
            else if(next==2) black++;
            else if(next==0){
                costs.add(new int[]{sc.nextInt(),sc.nextInt()});
            }
            if(white>N/2 || black>N/2) return -1;
        }
        if(white==N/2 && black==N/2) return 0;
        int w = N/2 - white;
        Collections.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[0]+o2[1])-(o2[0]+o1[1]);
            }
        });
        for(int i=0;i<costs.size();i++){
            if(i<w) res += costs.get(i)[0];
            else res += costs.get(i)[1];
        }
        return res;
    }
}
