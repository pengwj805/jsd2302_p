package file;

import java.io.File;

/**
 * 新建一个目录
 */
public class MkDirDemo {
    public static void main(String[] args) {
        //File dir = new File("./a/b/c");
        File dir = new File("./demo");
        if(dir.exists()){
            System.out.println("该目录已存在");
        }else{
            //该方法要求你创建的目录所在的目录必须存在，若不存在不会报错，但是也不会进行创建(相当于不执行)
            //dir.mkdir(); //将File对象表示的目录实际创建出来
            dir.mkdirs(); //该方法创建目录时会连同将所有不存在的父目录一同创建出来(推荐使用)
            System.out.println("该目录已创建");
        }
    }
}













