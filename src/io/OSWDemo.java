package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/**
 * 转换流:InputStreamReader和OutputStreamWriter，它们继承自Reader和Writer
 * 转换流是非常常用的字符流实现类，但实际开发中我们不会直接操作这两个流，
 * 但是它们在流连接中是非常重要的一环。
 *
 * 在流连接中的意义:
 * 由于其它字符流在流连接中要求只能连接在其它字符流上，而不能直接连接在字节流上
 * 原因:字符流是以字符为单位读写，而字节流是以字节为单位读写，
 *     读写单位不同，因此不能直接串联在一起工作
 * 转换流是一对字符流，并且是唯一可以直接连接在字节流上的字符流
 * 因此其它字符流都只能连接在转换流上，而转换再连接在字节流上，实现串联起写读写
 */
public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("osw.txt");
        //创建转换流时通常会指定第2个参数来明确字符集，以此来保证跨平台性
        OutputStreamWriter osw = new OutputStreamWriter(fos,StandardCharsets.UTF_8);
        osw.write("和我在成都的街头走一走，哦哦哦哦...");
        osw.write("直到所有的灯都熄灭了也不停留");
        System.out.println("写出完毕!");
        osw.close(); //关闭高级流时会自动关闭低级流
    }
}
















