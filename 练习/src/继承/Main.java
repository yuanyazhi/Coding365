package 继承;

final class TestM{
    final int a = 0;

    public int getA() {
        return a;
    }

}

public class Main {
    static class B{
        int a = 0;
    }
    public static void main(String[] args) {
        // final修饰变量
        final int a = 10;
        // final修饰引用数据类型之数组
        final int[] b = new int[2];
        System.out.println(a+" "+b[0]+" "+b[1]);
        b[0] = 2;
        b[1] = 4;
        b[0] = 23;
        System.out.println(a+" "+b[0]+" "+b[1]);
        // final修饰引用数据类型之类/接口
        TestM t = new TestM();
        System.out.println(t.getA());
    }
}
