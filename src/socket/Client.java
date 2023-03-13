package socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 聊天室的客户端
 */
public class Client {
    private Socket socket;
    public Client(){
        try {
            /*
              实例化Socket时就是与远程服务器建立连接的过程
              需要传递两个参数:
              1.服务器的IP地址，用于找到网络上对方的计算机
              2.服务端口，用于找到服务器计算机上的服务端的应用程序(软件)
             */
            System.out.println("正在连接服务器...");
            socket = new Socket("localhost",8088); //localhost表示本机IP
            System.out.println("与服务器建立连接成功!");
            System.out.println("你好吗?");
            System.out.println("我很好");
            System.out.println("今天最后一次课");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        try {
            //低级流，作用:将写出的字节发送给建立连接的远程计算机
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true); //自动行刷新

            Scanner scan = new Scanner(System.in);
            while(true){
                String line = scan.nextLine();
                if("exit".equals(line)){
                    break;
                }
                pw.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close(); //与服务端断开连接
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}


















