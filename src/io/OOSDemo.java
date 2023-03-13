package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流:处理流/高级流---ObjectInputStream和ObjectOutputStream
 * 1)作用:进行对象的序列化和反序列化
 * 2)对象序列化:将一个java对象转换为一组字节的过程称为对象序列化
 *   对象反序列化:将一组字节还原为java对象
 */
public class OOSDemo {
    public static void main(String[] args) throws IOException {
        String name = "张三";
        int age = 25;
        String gender = "男";
        String[] otherInfo = {"是一名学生","黑龙江佳木斯的","喜欢打篮球","喜欢王老师"};
        Student zs = new Student(name,age,gender,otherInfo);
        System.out.println(zs);
        /**
         * 对象输出流的writeObject()可以进行对象的序列化
         * 对象输出流在序列化对象时，必须保证序列化对象必须实现Serializable接口
         * 若没有实现序列化接口会发生NotSerializableException异常
         */
        FileOutputStream fos = new FileOutputStream("student.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(zs);
        System.out.println("写出完毕");
        oos.close();
    }
}















