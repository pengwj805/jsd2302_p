package io;

import jdk.management.resource.internal.inst.SimpleAsynchronousFileChannelImplRMHooks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
  通过提高每次读写的数据量减少实际读写的次数，可以提供读写的效率
  一组字节的读写:块读写
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("zsw.jpg");
        FileOutputStream fos = new FileOutputStream("zsw_cp2.jpg");

        /*
          InputStream超类中定义了块读取数据的方法:
          int read(byte[] data)
          一次性读取给定的字节数组data总长度的字节量，并存入到字节数组中，
          返回值表示实际读取到了多少个字节，若返回-1表示读到了末尾

          OutputStream超类上也定义了块写字节的方法:
          void write(byte[] data)
          一次性将给定的字节数组data中的所有字节写出
          void write(byte[] data,int offset,int len)
          一次性将给定的字节数组data从下标offset处开始的连续len个字节写出
         */
        /*
          zsw.jpg图片数据:
            11101011 10011010 01101101 11101111 10011001 00111010 01101110 文件末尾
          byte[] data = new byte[3]; //3个字节

           第1次调用fis.read(data)时:----一次性读取3个字节
           11101011 10011010 01101101 11101111 10011001 00111010 01101110 文件末尾
           ^^^^^^^^ ^^^^^^^^ ^^^^^^^^
           |-----本次读到的3个字节-----|
           data: {11101011 10011010 01101101}
           第1次调用fos.write(data)时:----一次性写入3个字节
           zsw_cp2.jpg图片数据:
           11101011 10011010 01101101

           第2次调用fis.read(data)时:----一次性读取3个字节
           11101011 10011010 01101101 11101111 10011001 00111010 01101110 文件末尾
                                      ^^^^^^^^ ^^^^^^^^ ^^^^^^^^
                                      |-----本次读到的3个字节-----|
           data:{11101111 10011001 00111010} //将第1次读的3个字节完整替换
           第2次调用fos.write(data)时:----一次性写入3个字节
           zsw_cp2.jpg图片数据:
           11101011 10011010 01101101 11101111 10011001 00111010

           第3次调用fis.read(data)时:----一次性读取3个字节
           11101011 10011010 01101101 11101111 10011001 00111010 01101110 文件末尾
                                                                 ^^^^^^^^ ^^^^^^^^ ^^^^^^^^
                                                                 仅读取到1个字节
           data:{01101110 10011001 00111010} //将第2次读取的第1个字节替换了，后两个还是上次的数据
                |-读取的-| |-----旧数据------|
           实际只读取了1个字节，所以也只写入1个字节
           zsw_cp2.jpg图片数据:
           11101011 10011010 01101101 11101111 10011001 00111010 01101110
         */
        long start = System.currentTimeMillis();
        byte[] data = new byte[1024*10]; //10kb
        int len; //记录每次实际读取的字节数
        while((len=fis.read(data))!=-1){ //每次读取10kb并判断是否读取到了末尾
            //将字节数组byte从下标0开始连续len个字节写出(做到读多少就写多少)
            fos.write(data,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕!耗时:"+(end-start)+"ms");

        fis.close();
        fos.close();


        /*
          zsw.jpg图片数据:
            11101011 10011010 01101101 11101111 10011001 00111010 01101110 文件末尾
          byte[] data = new byte[3]; //3个字节

           第1次调用fis.read(data)时:----一次性读取3个字节
           11101011 10011010 01101101 11101111 10011001 00111010 01101110 文件末尾
           ^^^^^^^^ ^^^^^^^^ ^^^^^^^^
           |-----本次读到的3个字节-----|
           data: {11101011 10011010 01101101}
           第1次调用fos.write(data)时:----一次性写入3个字节
           zsw_cp2.jpg图片数据:
           11101011 10011010 01101101

           第2次调用fis.read(data)时:----一次性读取3个字节
           11101011 10011010 01101101 11101111 10011001 00111010 01101110 文件末尾
                                      ^^^^^^^^ ^^^^^^^^ ^^^^^^^^
                                      |-----本次读到的3个字节-----|
           data:{11101111 10011001 00111010} //将第1次读的3个字节完整替换
           第2次调用fos.write(data)时:----一次性写入3个字节
           zsw_cp2.jpg图片数据:
           11101011 10011010 01101101 11101111 10011001 00111010

           第3次调用fis.read(data)时:----一次性读取3个字节
           11101011 10011010 01101101 11101111 10011001 00111010 01101110 文件末尾
                                                                 ^^^^^^^^ ^^^^^^^^ ^^^^^^^^
                                                                 仅读取到1个字节
           data:{01101110 10011001 00111010} //将第2次读取的第1个字节替换了，后两个还是上次的数据
                |-读取的-| |-----旧数据------|
           zsw_cp2.jpg图片数据:
           11101011 10011010 01101101 11101111 10011001 00111010 01101110 10011001 00111010
         */
        /*
        long start = System.currentTimeMillis();
        byte[] data = new byte[1024*10]; //10kb
        while(fis.read(data)!=-1){ //每次读取10kb并判断是否读取到了末尾
            fos.write(data); //一次写入10kb数据
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕!耗时:"+(end-start)+"ms");

        fis.close();
        fos.close();
         */

    }
}




















