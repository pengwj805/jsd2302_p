package exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 异常处理机制在IO操作中的运用
 */
public class FinallyDemo2 {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream("./a/b/fos.dat");
            fos.write(1);
        }catch (IOException e){
            System.out.println("出现IO异常并解决了");
        }finally {
            try {
                if(fos!=null){
                    fos.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("程序结束了");
    }
}

















