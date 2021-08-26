package aqy.aqy2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String str = sc.nextLine();
            String[] strs = str.split(",");
            int pre = Integer.valueOf(strs[0]);
            int res = 0, up = Integer.valueOf(strs[0]), down = Integer.valueOf(strs[0]);
            for(int i=1;i<strs.length;i++){
                int cur = Integer.valueOf(strs[i]);
                if(cur>pre){
                    up = Math.max(pre, cur);
                }else{
                    down = Math.min(pre,cur);
                }
                pre = cur;
                res = Math.max(res,Math.abs(up-down));
            }
            System.out.println(res);
        }
    }
}
