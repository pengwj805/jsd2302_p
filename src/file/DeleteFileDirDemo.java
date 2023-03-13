package file;

import java.io.File;

/**
 * 删除文件或目录
 */
public class DeleteFileDirDemo {
    public static void main(String[] args) {
        //File f = new File("./test.txt"); //文件
        //File f = new File("./demo"); //删除demo
        //File f = new File("./a/b/c"); //删除a下的b下的c
        File f = new File("./a"); //a目录中有内容，所以不能直接被删除
        if(f.exists()){
            f.delete(); //删除file所表示的文件或目录，只能空目录时才能正确删除
            System.out.println("该文件或目录已删除");
        }else{
            System.out.println("该文件或目录不存在");
        }
    }
}
















