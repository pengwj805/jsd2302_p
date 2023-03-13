package string;

/**
 * String substring(int start,int end):
 * 截取当前字符串中指定范围的字符串(含头不含尾---包含start，但不包含end)
 */
public class SubstringDemo {
    public static void main(String[] args) {
        //                      1----与下面的数字连成10
        //            01234567890
        String str = "www.tedu.cn";
        int start = str.indexOf(".")+1; //4
        int end = str.indexOf(".",start); //8
        String name = str.substring(start,end); //截取下标4到7的字符串
        System.out.println(name); //tedu

    }
}





















