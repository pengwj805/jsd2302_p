package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 缓冲字符输入流读取文本数据
 */
public class BRDemo {
    public static void main(String[] args) throws IOException {
        //文件流(字节流，低级流)
        FileInputStream fis = new FileInputStream("pw.txt");
        //转换流(字符流，高级流)
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        //缓冲字符流(字符流，高级流)
        BufferedReader br = new BufferedReader(isr);
        /*
          String readLine():
          读取一行字符串，返回的字符串中不包含最后的换行符
          如果单独读取到了换行符(一个空行)则返回值为空字符串("")
          如果返回值为null，则表示读到了末尾
         */
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line); //换行输出
            //System.out.print(line); //没有换行操作
        }
        br.close();

    }
}






























