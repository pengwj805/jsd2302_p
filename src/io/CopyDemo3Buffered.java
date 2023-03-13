package io;

import java.io.*;

/**
 * 缓冲流:是一对高级流，作用是加快读写效率
 * 1)BufferedInputStream:缓冲输入流
 * 2)BufferedOutputStream:缓冲输出流
 * 缓冲流读写效率快的原因:
 * 1)缓冲流内部有一个8KB的字节数组,
 *   你看着是一个字节一字节的读写，但缓冲流底层已经把它转换为块读写了
 * 缓冲流何时用才有意义:
 * 1)不同的高级流有不同的功能，但只有缓冲流才具有加速功能(块读写)，
 *   其它的高级流不具备加速功能，都是单字节读写，
 *   此时若又想先完成功能再加速处理，则需要流连接，将功能流连到缓冲流上
 */
public class CopyDemo3Buffered {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("wkj.jpg");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("wkj_cp2.jpg");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        long start = System.currentTimeMillis();
        int d;
        while((d=bis.read())!=-1){ //使用缓冲流读取字节
            bos.write(d); //使用缓冲流写出字节
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕!耗时:"+(end-start)+"ms");
        bis.close(); //只需关高级流，因为高级流中先关了低级流
        bos.close();
    }
}














