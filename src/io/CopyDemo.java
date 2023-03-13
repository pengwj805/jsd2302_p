package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件复制:将一个文件中的数据读出来，然后写入到另一个文件中
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("zsw.jpg");
        FileOutputStream fos = new FileOutputStream("zsw_cp.jpg");

        /*
          zsw.jpg图片数据:
            11101011 10011010 01101101 11101111 10011001 00111010 01101110...
          第1次调用: d=fis.read();
            11101011 10011010 01101101 11101111 10011001 00111010 01101110...
            ^^^^^^^^
            读取的字节

            fos.write(d); //将d对应的2进制的"低八位"写入到文件zsw_cp.jpg
            d: 00000000 00000000 00000000 11101011
                                          ^^^^^^^^
                                          写入的字节

            zsw_cp.jpg的内容:
            11101011

          ......

         */
        long start = System.currentTimeMillis(); //自1970年1月1日0时到此时此刻的毫秒数
        int d; //记录每次读取到的字节
        while((d=fis.read())!=-1){ //每次循环读取1个字节到d中，判断若不是-1，表示没有读取末尾
            fos.write(d); //将读出来的字节写入到要复制的文件中
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕!耗时:"+(end-start)+"ms");

        fis.close();
        fos.close();
    }
}

















