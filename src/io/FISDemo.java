package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 文件输入流，读取文件数据
 */
public class FISDemo {
    public static void main(String[] args) throws IOException {
        /*
          FileInputStream(String filename)
          FileInputStream(File file)
          上述两种构造器创建文件输入流时，如果参数表达的是一个文件则可以正常实例化
          若表达的文件不存在或表达的是一个目录则会抛出异常
         */
        FileInputStream fis = new FileInputStream("fos.dat"); //定义文件输入流
        /*
          InputStream超类上定义了读取一个字节的方法:(所有的字节输入流都具有该方法)
          int read():读取1个字节，并以int形式返回
          1)返回的int值对应的2进制中只有"低八位"是有效的，高24位全部补0
          2)如果该方法返回的int值为-1(32个1)时，则表示流读取了末尾


          第1次调用: int d = fis.read(); //读取第1个字节
          fos.dat的数据:
            00000001 00000010 文件末尾
            ^^^^^^^^
            读取的字节

            此时变量d对应的2进制样子: 00000000 00000000 00000000 00000001
                                 |------补充24个0-----------| 读取的字节----十进制的1

          第2次调用: d = fis.read(); //读取了第2个字节
          fos.dat的数据:
            00000001 00000010 文件末尾
                     ^^^^^^^^
                     读取的字节
            此时变量d对应的2进制样子: 00000000 00000000 00000000 00000010
                                 |------补充24个0-----------| 读取的字节----十进制的2

          第3次调用: d = fis.read(); //读取了文件末尾
          fos.dat的数据:
            00000001 00000010 文件末尾
                              ^^^^^^^
                              没有字节了
           此时变量d对应的2进制样子: 11111111 11111111 11111111 11111111
                                |-------------32个二进制的1----------|----十进制的-1
         */
        /*
          调用: int d = fis.read();
          fos.dat的数据:
          11111111 文件末尾
          ^^^^^^^^
          此时变量对应的2进制样子: 00000000 00000000 00000000 11111111
                              |------补充24个0-----------| 读取的字节----十进制的255
         */
        int d = fis.read(); //读取第1个字节
        System.out.println(d); //输出10进制数据:1
        //d = fis.read(); //读取了第2个字节
        //System.out.println(d); //输出10进制数据:2
        //d = fis.read(); //读取文件末尾了
        //System.out.println(d); //输出10进制数据:-1，表示到文件末尾了

        fis.close(); //关闭流

    }
}

































