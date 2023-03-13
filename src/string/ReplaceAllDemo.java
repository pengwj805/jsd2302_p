package string;
/*
  String replaceAll(String regex,String s):替换
  将当前字符串中满足正则表达式(regex)的部分给替换为指定字符串(s)
 */
public class ReplaceAllDemo {
    public static void main(String[] args) {
        String line = "abc123def456ghi78";
        //将数字部分替换为#NUMBER#
        line = line.replaceAll("[0-9]+","#NUMBER#");
        System.out.println(line);
    }
}



















