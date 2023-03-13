package homework;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名，如果文件存在则提示并要求用户更换，直到该文件还不存在为止，然后将这个文件在当前目录中创建出来。
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        while(true){ //自造死循环
            System.out.println("请输入文件名:");
            String name = scan.nextLine();
            File file = new File(name);
            if(file.exists()){ //存在
                System.out.println("该文件已存在，请重新输入");
            }else{ //不存在
                file.createNewFile();
                System.out.println("该文件已创建成功!");
                break;
            }
        }
    }
}


















