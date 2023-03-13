package object;

/** Object类的演示 */
public class ObjectDemo {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");
        //String类重写了equals()来比较字符串内容是否相同
        System.out.println(s1.equals(s2)); //true

        StringBuilder builder1 = new StringBuilder("hello");
        StringBuilder builder2 = new StringBuilder("hello");
        //StringBuilder类没有重写equals()，因此调用的还是Object类的equals()比较地址
        System.out.println(builder1.equals(builder2)); //false

        //s1与builder1的类型不同，所以equals()一定是false
        System.out.println(s1.equals(builder1)); //false

        /*
          调用Object类的equals()，内部还是在使用==比较地址，没有参考意义
          若想比较对象的属性值是否相同，我们认为Object类的equals()并不能满足需求
          因此常常需要重写equals()
         */
        /*
        Point p1 = new Point(100,200);
        Point p2 = new Point(100,200);
        System.out.println(p1==p2); //false，==比较的是地址
        //因为Point类重写了equals()方法
        //所以此处调用的是重写之后的equals()，比较的是属性的值是否相同
        System.out.println(p1.equals(p2)); //true
        */











        /*
          输出引用变量时默认调用Object类的toString()方法
          该方法返回的字符串格式为: 类的全称@hashcode值
          但通常这个返回结果对我们的开发是没有意义的
          我们真正想输出的应该是对象的属性值
          我们认为Object类的toString()并不能满足需求
          因此我们常常重写toString()来返回具体的属性值
         */
        /*
        Point p = new Point(100,200);
        System.out.println(p);
        System.out.println(p.toString());
        */
    }
}
















