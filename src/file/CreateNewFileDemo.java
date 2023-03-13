package file;

import java.io.File;
import java.io.IOException;

/**
 * 创建一个新文件
 */
public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException {
        /*
        //在当前目录下创建10个文件，名字为test1.txt---test10.txt
        for(int i=1;i<=10;i++){
            File file = new File("./test"+i+".txt");
            if(!file.exists()){
                file.createNewFile();
            }
        }
        System.out.println("创建完毕!");
        */


        File file = new File("./test.txt");
        //判断当前file表示的路径是否存在了对应的文件或目录，若已经存在则返回ture，否则返回false
        if(file.exists()){
            System.out.println("文件已存在");
        }else{
            //将file表示的文件真实的创建出来，注意:若要创建文件的目录不存在，则会发生异常
            //该方法要求处理异常:将光标留在方法上，然后alt+回车，选第一项add exception
            file.createNewFile();
            System.out.println("该文件已创建!");
        }
    }
}














