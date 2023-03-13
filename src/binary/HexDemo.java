package binary;
/** 16进制的演示 */
public class HexDemo {
    public static void main(String[] args) {
        /*
          16进制:缩写2进制
          1)0x为16进制字面量前缀
          2)0b为2进制字面量前缀，可以加下划线---一般不用，一般都是16进制缩写
          3)计算机内部没有10进制，也没有16进制，只有2进制
          4)Integer.toHexString()可以将16进制数返回
            显示16进制:System.out.println(Integer.toHexString(n));
         */
        /*
        int n = 0x2fd47b; //0x表示16进制
        int m = 0b10_1111_1101_0100_0111_1011; //0b表示2进制
        System.out.println(Integer.toBinaryString(n)); //按2进制输出
        System.out.println(Integer.toBinaryString(m));
        System.out.println(Integer.toHexString(n)); //按16进制输出
        System.out.println(Integer.toHexString(m));
        System.out.println(n); //按10进制输出
        System.out.println(m);
         */

        /*
          8进制: 以0开头------------平时不用
          1)规则:逢8进1
          2)数字:0 1 2 3 4 5 6 7
          3)基数:8
          4)权:512 64 8 1
         */
        int a = 067; //以0开头的表示8进制
        System.out.println(a); //55(6个8+7个1)

        /*
          小面试题:
          int a = 068; 正确吗?
          答:编译错误，因为0开头的表示8进制，8进制最大数字为7
         */

    }
}
















