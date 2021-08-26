package 反射;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class A{
    int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        // 反射目的：得到一个Class的类对象
        // 反射实现方法1：Class.forName(String path)
        Class a = Class.forName("java.util.ArrayList");
        System.out.println(a.getClass());
        System.out.println("-----------------------------------------------------------");

        // 反射实现方法2：className.class
        Class b = A.class;
        System.out.println(b.getClass());
        System.out.println("-----------------------------------------------------------");

        // 反射实现方法3：clazz.getClass
        Class c = new A().getClass();
        System.out.println(c.getClass());
        Field[] fields = c.getDeclaredFields(); // 属性
        Method[] methods = c.getDeclaredMethods(); //方法
        for (Field field : fields) {
            //打印属性信息，包括访问控制修饰符，类型及属性名
            System.out.println(field);
            System.out.println("修饰符：" + Modifier.toString(field.getModifiers()));
            System.out.println("类型：" + field.getType());
            System.out.println("属性名：" + field.getName());
        }
        for (Method method : methods) {
            //打印方法签名
            System.out.println(method);

            System.out.println("修饰符：" + Modifier.toString(method.getModifiers()));
            System.out.println("方法名：" + method.getName());
            System.out.println("返回类型：" + method.getReturnType());
            //获取方法的参数对象
            Class<?>[] clazzes = method.getParameterTypes();
            for (Class<?> class1 : clazzes) {
                System.out.println("参数类型：" + class1);
            }
        }
        A a1 = (A)c.newInstance();
        a1.setA(3);
        System.out.println("a1.a=" + a1.getA());

        System.out.println("-----------------------------------------------------------");

        // 反射实现方法4：基本数据类型包装类
        Class d = Integer.TYPE;
        System.out.println(d.getClass());
    }

}
