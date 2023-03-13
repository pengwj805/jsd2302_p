package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * JDK1.8之后推出了一个新特性:Lambda表达式
 * 作用:可以用更简洁的代码实现匿名内部类
 * 规则:
 * 1)不是任何匿名内部类都可以转换为Lambda表达式
 * 2)Lambda表达式对接口的要求：只能是函数式接口
 * 3)函数式接口:接口中要求实现类必须重写的方法只有一个
 * 语法:
 * (参数列表)->{
 *     方法体
 * }
 */
public class LambdaDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //匿名内部类写法
        Collections.sort(list, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });

        //Lambda表达式写法
        Collections.sort(list, (String o1, String o2) -> {
                return o1.length()-o2.length();
        });

        //Lambda表达式中的参数类型可以不写
        Collections.sort(list, (o1, o2) -> {
            return o1.length()-o2.length();
        });

        //Lambda表达式方法体中只有一句代码，方法体的{}可以不写，如果这句话中有return，也一并不写
        Collections.sort(list, (o1, o2) -> o1.length()-o2.length());

        //Lambda表达式的方法参数只有1个,那么()可以忽略不写---本案例不适用

    }
}



















