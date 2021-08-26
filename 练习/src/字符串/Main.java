package 字符串;

public class Main {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = s1+"b"; // s1+"b" 的值为"ab",但是地址和"ab"不一样
        String s3 = "a"+"b";// "a"+"b"会在编译时直接相加，直接得到结果

        System.out.println(s2=="ab");
        System.out.println(s3=="ab");
    }
}
