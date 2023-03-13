package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * 聊天室的服务端
 */
public class Server {
    /*
      java.net.ServerSocket
      运行在服务端的ServerSocket的主要任务:
      1.向服务端申请服务端口，客户端就是通过该端口与服务器建立连接的
      2.监听服务端口，一旦一个客户端连接了就会立即创建一个Socket实例与之交互
        我们将ServerSocket比喻为某客服中心的"总机"
     */
    private ServerSocket serverSocket;
    public Server(){
        try {
            /*
              如果端口被其他程序占用了，则会发生java.net.BindException异常: Address already in use
              解决办法:
              1.更换端口号
              2.杀死占用该端口的进程(通常发生在服务端启动两次导致的情况下)
             */
            System.out.println("正在启动服务端");
            serverSocket = new ServerSocket(8088);
            System.out.println("服务端启动完毕!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        /*
           ServerSocket提供的重要方法:
           Socket accept()
           用于接收客户端的连接，并返回一个Socket实例与连接的客户端交互
           该方法是一个阻塞方法，调用后程序会"卡住"，直到一个客户端连接为止
         */
        try {
            while(true){
                System.out.println("等待客户端连接");
                Socket socket = serverSocket.accept(); //接电话
                System.out.println("一个客户端连接上了");

                InputStream in = socket.getInputStream(); //低级流
                InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                /*
                  当我们通过br.readLine()读取来自远端计算机(客户端)发送过来的字符串时，
                  远端计算机只有调用socket.close()正常与我们断开连接时，readLine()才会返回null。
                  注意:如果客户端异常中断(强制杀死进程)，此时readLine()会抛出异常
                 */
                String message;
                while((message=br.readLine())!=null){
                    System.out.println("客户端说:"+message);
                }
            }

            /*

             */

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
}

















