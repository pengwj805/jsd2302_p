package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * 使用转换流读取文本数据
 */
public class ISRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("osw.txt");
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        /*
          int read()
          读取1个字符(到底读取几个字节要根据它的内容以及对应的字符集来决定)
          返回的int值实际上是一个char，返回-1表示读取了末尾
         */
        int d;
        while((d=isr.read())!=-1){
            System.out.print((char)d);
        }
        isr.close();
    }
}






















