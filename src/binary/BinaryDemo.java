package binary;
/** 二进制的演示 */
public class BinaryDemo {
    public static void main(String[] args) {
        /*
          1)编译器在编译时会将10进制编译为2进制，然后按照2进制来运算
             .java(45)-----编译后-----.class(101101)
          2)int类型是32位2进制数，显示2进制自动省略高位0
          3)Integer.toBinaryString()可以将底层2进制数返回
            显示2进制:System.out.println(Integer.toBinaryString(n));
            System.out.println()将2进制转换为10进制输出
            显示10进制:System.out.println(n);
         */
        int n = 45; //编译时会被编译为: 101101
        System.out.println(Integer.toBinaryString(n)); //101101，以2进制输出
        System.out.println(n); //45，以10进制输出

        n++; //将101101增1----101110
        System.out.println(Integer.toBinaryString(n)); //101110，以2进制输出
        System.out.println(n); //46，以10进制输出
    }
}
















