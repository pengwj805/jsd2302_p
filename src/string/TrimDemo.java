package string;

/**
 * String trim():
 * 去除当前字符串两边的空白字符
 */
public class TrimDemo {
    public static void main(String[] args) {
        String str = "     hello world        ";
         str =str.trim(); //去除str两边的空白字符(一个新的字符串对象)，并存入str中
        System.out.println(str); //hello world
    }
}













