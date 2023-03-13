package io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 */
public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        //文件流(字节流，低级流):将字节写入到文件中
        FileOutputStream fos = new FileOutputStream("pw.txt");
        //转换流(字符流，高级流):1.负责衔接字符流与字节流  2.将写出的字符转换为字节再写出
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        //缓冲字符流(字符流，高级流):块文本数据加速(内部缓冲区默认8192个char)
        BufferedWriter bw = new BufferedWriter(osw);
        //PrintWriter(字符流，高级流): 1.按行写出字符串  2.具有自动行刷新功能
        //构造器第1个参数为流，第2个参数可以传入boolean类型的数据来表示是否打开自动刷新功能(flush)
        PrintWriter pw = new PrintWriter(bw,true);

        Scanner scan = new Scanner(System.in);
        System.out.println("请开始输入内容，单独输入exit时退出");
        while(true){
            String line = scan.nextLine();
            if("exit".equals(line)){
                break;
            }
            //当开启自动行刷新后，每当调用println()方法写出一行后都会自动flush()
            //注意:print()不会flush的
            pw.println(line);
        }
        pw.close();
    }
}


















