package exception;

/**
 * 测试异常的抛出
 */
public class Student {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException {
        if(age<0 || age>100){
            /*
              当使用throw抛出一个非RuntimeException时，必须在当前方法上用throws声明该异常的抛出
             */
            throw new IllegalAgeException("年龄不合法");
        }
        this.age = age;
    }
}

















