package io;

import java.io.*;

/**
 * 使用对象输入流进行对象的反序列化
 * 反序列化:将一组字节还原为java对象
 */
public class OISDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
          Object readObject():
          对象输入流的readObject()可以进行对象的反序列化
          注意:对象输入流通过下面所连接的流来读取的字节
              必须是对象输出流序列化对象之后的一组字节
              说白了：序列化的是学生对象，反序列化出来的也一定是学生对象
         */
        FileInputStream fis = new FileInputStream("student.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        Student zs = (Student)obj;
        System.out.println(zs);
        ois.close();
    }
}















