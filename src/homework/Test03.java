package homework;

import java.io.File;
import java.util.Scanner;

/**
 * 要求用户在控制台输入一个目录名，然后将这个目录创建在当前项目目录下
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入目录名:");
        String name = scan.nextLine();
        File dir = new File(name);
        if(dir.exists()){
            System.out.println("该目录已存在");
        }else{
            dir.mkdirs();
            System.out.println("该目录已创建成功");
        }
    }
}



















