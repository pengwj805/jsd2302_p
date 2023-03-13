package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 将所有的小写字母写入到文件fos.txt中
 */
public class Test {
    public static void main(String[] args) throws IOException {
        /*
          char c = 'a';    char c = 97;
          小写字母a就是97
          本意:
            整数97的2进制与ASCII编码中的'a'的2进制是一样的---01100001
         */
        FileOutputStream fos = new FileOutputStream("fos.txt");
        for(int i=0;i<26;i++){
            fos.write(97+i); //将整数(97+i)的2进制"低八位"写入文件中
        }
        System.out.println("写出完毕");
        fos.close();
    }
}


















