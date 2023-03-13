package exception;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * 当派生类重写超类含有throws声明异常抛出的方法时，对throws的重写规则
 */
public class ThrowsDemo2 {
    public void dosome() throws IOException, AWTException { }
}

class SubClass extends ThrowsDemo2 {
    //可以完全相同，可以不抛，可以抛部分，可以抛子类型
    //public void dosome() throws IOException, AWTException { } //完全相同一定可以
    //public void dosome() { } //不抛出也可以
    //public void dosome() throws IOException { } //仅抛出部分异常
    //public void dosome() throws FileNotFoundException { } //抛出超类声明异常的子类型异常

    //不能抛没有的，不能抛父类型
    //public void dosome() throws IllegalAgeException { } //不允许抛出额外异常(超类没有抛出，并且没有继承关系的异常)
    //public void dosome() throws Exception { } //不允许抛出超类方法抛出异常的超类型异常
}















