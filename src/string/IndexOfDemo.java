package string;

/**
 * int indexOf(String s):
 * 检索给定字符串(s)在当前字符串中第一次出现的位置----根据字符串找位置
 * int lastIndexOf(String s):
 * 检索给定字符串(s)在当前字符串中最后一次出现的位置----根据字符串找位置
 */
public class IndexOfDemo {
    public static void main(String[] args) {
        //                      111111----和下面的连成10/11/12/13/14/15
        //            0123456789012345
        String str = "thinking in java";
        int index = str.indexOf("in"); //检索in在str中第1次出现的位置
        System.out.println(index); //2
        index = str.indexOf("in",3); //从下标为3的位置开始找in第1次出现的位置
        System.out.println(index); //5
        index = str.indexOf("abc"); //若字符串在str中不存在，则返回-1
        System.out.println(index); //-1

        index = str.lastIndexOf("in"); //检索in在str中最后一次出现的位置
        System.out.println(index); //9
    }
}























