package file;

import java.io.File;
import java.io.FileFilter;

/**
 * listFiles()方法提供了一个重载，可以传入一个文件过滤器FileFilter
 * 该方法在获取一个目录中的子项时仅会将所有满足过滤器要求的子项返回
 */
public class ListFilesDemo2 {
    public static void main(String[] args) {
        //仅获取当前项目目录下的所有文本文件(文件名以".txt"结尾)
        File dir = new File(".");
        if(dir.isDirectory()){ //如果是一个目录
            FileFilter filter = new FileFilter() {
                //重写accept方法就是定义过滤器的接收条件
                //重写原则:当参数file对象是该过滤器接收的元素时返回true，否则返回false
                public boolean accept(File file) {
                    String name = file.getName();
                    return name.endsWith(".txt"); //判断是否是以".txt"结尾
                }
            };

            //返回目录中所有满足过滤器要求的子项
            File[] subs = dir.listFiles(filter);
            for(File sub : subs){
                System.out.println(sub.getName());
            }
        }
    }
}











