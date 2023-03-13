package object;

import java.util.ArrayList;
import java.util.Collection;

/** 包装类的演示 */
public class IntegerDemo {
    public static void main(String[] args) {
        //演示包装类的常用操作:
        //1)可以通过包装类来获取基本类型的取值范围:
        int max = Integer.MAX_VALUE; //获取int的最大值
        int min = Integer.MIN_VALUE; //获取int的最小值
        System.out.println("int的最大值为:"+max+"，最小值为:"+min);

        long max1 = Long.MAX_VALUE; //获取long的最大值
        long min1 = Long.MIN_VALUE; //获取long的最小值
        System.out.println("long的最大值为:"+max1+"，最小值为:"+min1);

        //2)包装类可以将字符串转换为对应的基本类型----必须熟练掌握
        String s1 = "39";
        int age = Integer.parseInt(s1); //将字符串s1转换为int类型并赋值给age
        System.out.println(age); //39---int类型

        String s2 = "123.456";
        double price = Double.parseDouble(s2); //将字符串s2转换为double类型并赋值给price
        System.out.println(price); //123.456----double类型

        /*
        //触发了自动装箱特性，会被编译为: Integer i = Integer.valueOf(5);
        Integer i = 5; //基本类型到包装类-------装箱
        //触发了自动拆箱特性，会被编译为: int j = i.intValue();
        int j = i; //包装类到基本类型-----------拆箱
        */

        /*
        //演示包装类的定义:
        Integer i1 = new Integer(5);
        Integer i2 = new Integer(5);
        System.out.println(i1==i2); //false，==比较的是地址
        System.out.println(i1.equals(i2)); //true，包装类重写equals()比较值了

        //valueOf()方法会复用1个字节(-128到127)范围内的数据，建议使用valueOf()
        Integer i3 = Integer.valueOf(5);
        Integer i4 = Integer.valueOf(5);
        System.out.println(i3==i4); //true
        System.out.println(i3.equals(i4)); //true，包装类重写equals()比较值了

        //将包装类转换为基本类型
        int i = i4.intValue();
        System.out.println(i);
        */
    }
}



















