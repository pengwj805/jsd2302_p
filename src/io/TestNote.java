package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 简单记事本工具
 * 要求:
 *   程序启动后将用户在控制台输入的每一行字母串都写入到文件note.txt中
 *   直到用户单独输入exit时程序退出
 *   注意:写入文件的内容不用考虑换行问题
 */
public class TestNote {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("note.txt");
        System.out.println("请开始输入内容，单独输入exit退出");
        while(true){
            String line = scan.nextLine(); //接收用户输入的字符串
            if("exit".equals(line)){ //若用户输入的是exit
                break; //退出循环
            }
            fos.write(line.getBytes(StandardCharsets.UTF_8)); //将输入的内容写入文件中
        }
        System.out.println("结束了");
        fos.close();
    }
}

















