package exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.IllegalFormatException;

/**
 * 异常的抛出
 */
public class ThrowDemo {
    public static void main(String[] args) {
        Student zs = new Student();
        try {
            zs.setAge(1000);
        } catch (Exception e) {
            System.out.println("发生异常，并处理了");
        }
        System.out.println("此人的年龄为:"+zs.getAge()+"岁");
    }
}




















