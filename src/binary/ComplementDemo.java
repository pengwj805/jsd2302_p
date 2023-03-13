package binary;
/** 补码的演示 */
public class ComplementDemo {
    public static void main(String[] args) {
        /*
        //规律数:
        int max = Integer.MAX_VALUE; //int的最大值
        int min = Integer.MIN_VALUE; //int的最小值
        System.out.println(Integer.toBinaryString(max));  //0111111...
        System.out.println(Integer.toBinaryString(min));  //1000000...
        System.out.println(Integer.toBinaryString(-1));  //111111...
         */

        int n = -45;
        System.out.println(Integer.toBinaryString(n)); //2进制显示
        System.out.println(n); //10进制显示

    }
}















