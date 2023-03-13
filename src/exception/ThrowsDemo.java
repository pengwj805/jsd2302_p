package exception;

/**
 * throws的演示
 */
public class ThrowsDemo {
    public static void main(String[] args) {
        /*
          当调用一个含有throws声明异常抛出的方法时，编译器要求必须处理该异常，处理手段有两种:
          1. try...catch捕获并处理这个异常
          2. 在当前方法上(main)上继续使用throws声明该异常抛出给上层调用者
          3. 一般不在main方法中做throws抛出
         */
        Student zs = new Student();
        try {
            zs.setAge(250);
        } catch (IllegalAgeException e) {
            e.printStackTrace(); //打印错误堆栈信息
            //System.out.println(e.getMessage()); //获取错误信息并输出
        }
        System.out.println("此人年龄为"+zs.getAge()+"岁");
    }
}


















