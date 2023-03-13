package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

/*
缓冲字符流-------最常用的读写字符串的流
是一对高级流，并且是字符流
内部维护一个默认8KB(8192)长度的char数组，还是以块读写形式读写字符以提高读写效率
BuffredWriter和BufferedReader

PrintWriter:按行写入数据
 */
public class PWDemo {
    public static void main(String[] args) throws IOException {
        //最常用写入字符串方式:
        //底层连接了BufferedWriter，连接了OutputStreamWriter，连接了FileOutputStream
        PrintWriter pw = new PrintWriter("pw.txt");
        pw.println("和我在成都的街头走一走，哦哦哦哦..");
        pw.println("直到所有的灯都熄灭了也不停留");
        System.out.println("写出完毕");
        pw.close();

        /*
        FileOutputStream fos = new FileOutputStream("pw.txt"); //文件流(低级流)
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8); //转换流(高级流)
        BufferedWriter bw = new BufferedWriter(osw); //缓冲字符流(高级流)
        bw.write("和我在成都的街头走一走，哦哦哦哦..");
        bw.write("直到所有的灯都熄灭了也不停留");
        System.out.println("写出完毕!");
        bw.close(); //先调用flush()冲水
         */
    }
}


















