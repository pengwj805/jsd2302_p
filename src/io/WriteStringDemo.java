package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 向文件中写入文本数据
 */
public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt",true);

        /*
          文字与2进制的对应关系有各种标准：字符集------了解
          支持中文的字符集常见的有:
          1)UTF-8：unicode的转换编码
            1.1)英文、符号、数字各占1个字节，但中文占3个字节
          2)GBK:国标编码
            2.1)英文、符号、数字各占1个字节，但中文占2个字节
         */
        String line = "心在跳是爱情如烈火，你在笑疯狂的人是我";
        byte[] data = line.getBytes(StandardCharsets.UTF_8); //将line的内容按照utf-8编码转换为字节数组
        fos.write(data);
        fos.write("，爱如火会温暖了心窝".getBytes(StandardCharsets.UTF_8));

        System.out.println("写出完毕!");
        fos.close();
    }
}


















