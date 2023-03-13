package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/** 集合的排序---Point对象 */
public class SortPoint {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(5,8));
        list.add(new Point(15,60));
        list.add(new Point(57,89));
        list.add(new Point(1,4));
        list.add(new Point(10,8));
        list.add(new Point(22,35));
        System.out.println("list原始数据:"+list);

        //jdk1.8时，List集合自身提供了sort方法进行排序，方法中需要传入比较器
        list.sort(new Comparator<Point>() {
            public int compare(Point o1, Point o2) {
                return o1.getX()-o2.getX();
            }
        });
        System.out.println("list排序后数据:"+list);

        list.sort((o1,o2)->{
            int len1 = o1.getX()*o1.getX()+o1.getY()*o1.getY();
            int len2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
            return len1-len2; //升序
        });

        /*
        //自定义排序规则:
        Collections.sort(list, new Comparator<Point>() {
            public int compare(Point o1, Point o2) {
                int len1 = o1.getX()*o1.getX()+o1.getY()*o1.getY();
                int len2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
                //return len1-len2; //升序
                return len2-len1; //降序
                //return o1.getX()-o2.getX(); //按x坐标升序
                //return o2.getY()-o1.getY(); //按y坐标降序
            }
        });
         */
        Collections.sort(list,(o1,o2)->{
            int len1 = o1.getX()*o1.getX()+o1.getY()*o1.getY();
            int len2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
            return len1-len2; //升序
        });

        System.out.println("list排序后数据:"+list);

    }
}

















