package file;

import java.io.File;

/** 访问一个目录中的所有子项 */
public class ListFilesDemo {
    public static void main(String[] args) {
        File dir = new File("."); //"."表示当前目录(当前项目路径)
        /*
          boolean isFile()
          判断当前file对象表示的是否为一个文件且已存在
          boolean isDirectory()
          判断当前File对象表示的是否为一个目录且已存在
         */
        if(dir.isDirectory()){
            File[] subs = dir.listFiles(); //获取当前目录下的所有子项
            System.out.println("当前项目目录下共有"+subs.length+"个子项");
            for(File sub : subs){
                System.out.println(sub.getName()); //输出每个子项的名称
            }
        }
    }
}
















