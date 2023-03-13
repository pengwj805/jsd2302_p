package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 读取文本数据
 */
public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("fos.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] data = new byte[(int)file.length()]; //创建与文件等长的字节数组
        fis.read(data); //一次性读取数据到data中
        String line = new String(data, StandardCharsets.UTF_8); //将data中的字节还原为字符串
        System.out.println(line);
        fis.close();
    }
}
















