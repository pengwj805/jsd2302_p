package string;

/**
 * 标准JavaBean要求:
 * 1.成员变量都是私有的
 * 2.提供对应的getter/setter
 * 3.必须提供一个无参构造方法
 */
public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


































