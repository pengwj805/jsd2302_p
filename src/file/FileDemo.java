package file;

import java.io.File;

/**
 * java.io.File:
 * 该类的每一个实例用于表示一个文件或目录，但实际上表示的是一个抽象路径。
 * 使用File可以:
 * 1)访问其表示的文件或目录的属性信息(名字、大小、权限等)
 * 2)创建/删除文件或目录
 * 3)访问一个目录中的子项信息
 *
 * 注意:File是不能访问文件数据的
 */
public class FileDemo {
    public static void main(String[] args) {
        //绝对路径：从盘符开始，不利于跨平台(你的硬盘不一定有)
        //File file = new File("C:/Users/TEDU/IdeaProjects/jsd2302/demo.txt");

        //相对路径:相对于某个位置开始，有利于跨平台
        //常用的相对路径有: 1)"./"表示当前目录  2)类加载路径(后期讲)
        //"./"在Idea执行程序时表达的是当前类所在的项目目录，此处指jsd2302这个目录的位置
        File file = new File("./demo.txt");

        String name = file.getName(); //获取file表示的文件或目录的名字
        System.out.println("name:"+name);

        //长度为0有两种情况: 1.路径无效  2.确实文件没有内容
        long len = file.length(); //获取file表示的文件或目录的长度(大小)
        System.out.println("length:"+len);

        boolean ih = file.isHidden(); //文件是否是隐藏的
        boolean cr = file.canRead();  //文件是否可读
        boolean cw = file.canWrite(); //文件是否可写
        System.out.println("是否隐藏:"+ih); //false
        System.out.println("是否可读:"+cr); //true
        System.out.println("是否可写:"+cw); //true

    }
}

















