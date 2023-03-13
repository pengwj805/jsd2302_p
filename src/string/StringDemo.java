package string;
/** String的演示 */
public class StringDemo {
    public static void main(String[] args) {
        /*
          常见面试题:
            String s = new String("hello");
            问:如上语句创建了几个对象?
            答:2个
              第一个:字面量"hello"
              ----java会创建一个String对象表示字面量"hello"，并将其存入常量池中
              第二个:new String()
              ----new String()时会再创建一个字符串对象，并引用hello字符串内容
         */
        String s = new String("hello"); //创建了2个对象
        String s1 = "hello"; //复用常量池中的字面量对象地址
        System.out.println(s==s1); //false，==比较的是地址是否相同

        //在实际应用中，String比较相等一般都是比较字符串的内容是否相同
        //因此我们需要使用equals()方法来比较两个字符串内容是否相同
        System.out.println(s.equals(s1)); //true，equals()比较的是内容是否相同---必须掌握

        /*
          使用字面量("")来创建字符串对象时，JVM会检查常量池中是否有该对象
          1)若没有，则会创建字符串对象，并将其引用存入到常量池中
          2)若有，则直接将常量池中的对象(引用)返回，并不会创建新的字符串对象
         */
        /*
        String s1 = "123abc"; //常量池还没有，因此创建该字符串对象，并存入常量池中
        String s2 = "123abc"; //常量池中已经有了，直接复用了
        String s3 = "123abc"; //常量池中已经有了，直接复用了
        //引用类型==，比较的是地址是否相同-----这是规定
        System.out.println(s1==s2); //true
        System.out.println(s1==s3); //true
        System.out.println(s2==s3); //true

        s1 = s1+"!"; //创建新的字符串对象("123abc!")，并将地址赋值给s1
        System.out.println(s1==s2); //false
        */

        /*
        String s1 = "123abc"; //堆中创建123abc字符量对象，并缓存到常量池中
        //编译器在编译时，若发现是两个字面量相连，则会直接连接好并将结果保存起来
        //如下语句会被编译为: String s2 = "123abc";
        String s2 = "123"+"abc";
        System.out.println(s1==s2); //true

        String s3 = "123";
        //因为s3是一个变量，所以在编译期并不会直接编译好
        String s4 = s3+"abc"; //创建一个新的对象存储123abc
        System.out.println(s1==s4); //false
        */
    }
}


































