package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 缓冲流写出时的缓冲区问题
 */
public class FlushDemo {
    public static void main(String[] args) throws IOException {
        /*
          通过缓冲流写出的数据会被临时存入缓冲流内部的字节数组中
          直到数组存满数数据时才会真实写出一次
          通过缓冲输出流的flush()方法会强制将缓冲流中已经缓冲的数据一次性写出

          flush()方法是在接口Flushable中定义的
          而字节输出流的超类OutputStream实现了该接口，这意味着所有字节输出流都具有该方法
          但是只有缓冲流真正实现了flush()应有的功能
          其它高级流flush()方法都是调用其连接的流的flush()，将该动作传递下去

          实际应用中何时用缓冲流?--------下午详细说
          下午我们还有其它的高级流，高级流是对数据进行加工处理的，并不管加速的问题
          如果没有缓冲流，咱们只能是加工一点处理一点，单字节操作，慢
          这时加个缓冲流，提供读写速度，快
         */

        FileOutputStream fos = new FileOutputStream("bos.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String line = "和我在成都的街头走一走，哦哦哦哦...";
        bos.write(line.getBytes(StandardCharsets.UTF_8));
        System.out.println("写出完毕");
        bos.flush(); //flush:冲水
        bos.close(); //缓冲流close()时会自动调用一次flush()确保所有数据关闭前写出
    }
}
















