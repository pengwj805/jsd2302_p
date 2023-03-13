package exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JDK1.7后推出的特性:自动关闭特性
 * 语法:
 * try(
 *    定义需要在finally中调用close()方法关闭的对象----流
 * ){
 *     IO操作代码
 * }catch(XXXException e){
 *     ...
 * }
 */
public class AutoCloseableDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");

        try(
            //自动关闭特性是编译器认可的，代码编译后会变为FinallyDemo2的样子
            //在try()中定义的内容最终会被编译器修改为finally中调用close()关闭操作
            FileOutputStream fos = new FileOutputStream("fos.dat");

            //只有实现了AutoCloseable接口的类才能在此处定义
            //String str = "abc"; //编译错误
        ){
            fos.write(1);
        }catch(IOException e){
            e.printStackTrace();
        }

        System.out.println("程序结束了");
    }
}













