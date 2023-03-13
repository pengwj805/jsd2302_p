package homework;

import java.io.File;
import java.io.FileFilter;

/**
 * 列出当前目录中所有名字包含s的子项。要求：使用匿名内部类和lambda两种写法
 */
public class Test06 {
    public static void main(String[] args) {
        File dir = new File(".");
        if(dir.isDirectory()){ //若是目录
            /*
            File[] subs = dir.listFiles(new FileFilter() {
                public boolean accept(File file) {
                    return file.getName().contains("s"); //文件名包含s的
                }
            });
             */
            File[] subs = dir.listFiles(file->file.getName().contains("s"));
            for(File sub : subs){
                System.out.println(sub.getName());
            }
        }
    }
}
















