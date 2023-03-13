package ooday05;
/** 点 */
public class Point {
    /*
      getter/setter的原因:
      1)很多框架的配置操作都是基于getter/setter进行的，没有它就取不到数据
        可以将设计getter/setter理解为一种行业标准
      2)可以更好的保证数据的合法性(因为方法中可以做条件控制)
      3)getter/setter可以选择性存在(只有getter(只读)，或只有setter(只写))
     */
    private int x;
    private int y;

    public int getX(){ //getter
        return x;
    }
    public void setX(int x){ //setter
        this.x = x;
    }

    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }

}





















