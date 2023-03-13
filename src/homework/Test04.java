package homework;

import java.io.File;
import java.util.Scanner;

/**
 * 要求用在控制台输入一个目录名，然后将当前项目目录下的这个目录删除。（只要求删除Test03创建的空目录）
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入要删除的目录名:");
        String name = scan.nextLine();
        File dir = new File(name);
        if(dir.exists()){
            dir.delete();
            System.out.println("该目录已删除");
        }else{
            System.out.println("该目录不存在");
        }
    }
}












