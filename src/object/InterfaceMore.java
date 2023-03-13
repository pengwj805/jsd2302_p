package object;

public interface InterfaceMore {
    public abstract void show(); //抽象方法-----用得多

    public static final int NUM = 5; //常量----用得少

    public default void test(){ //默认方法------用得少，jdk1.8加入的
        //...
    }

    public static void say(){ //静态方法--------用得少，jdk1.8加入的
    }
}











