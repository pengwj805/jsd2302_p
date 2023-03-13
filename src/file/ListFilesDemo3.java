package file;

import java.io.File;
import java.io.FileFilter;

/** 文件过滤器Lambda版 */
public class ListFilesDemo3 {

    public static void main(String[] args) {
        File dir = new File(".");
        if(dir.isDirectory()){
            File[] subs = dir.listFiles(file -> file.getName().endsWith(".txt"));
            for(File sub : subs){
                System.out.println(sub.getName());
            }
        }
    }
}
