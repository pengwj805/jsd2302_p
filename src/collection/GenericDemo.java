package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/** 泛型的演示 */
public class GenericDemo {
    public static void main(String[] args) {
        Collection<Point> c = new ArrayList<>();
        c.add(new Point(1,2));
        c.add(new Point(3,4));
        c.add(new Point(5,6));
        c.add(new Point(7,8));

        Iterator<Point> it = c.iterator();
        while(it.hasNext()){
            Point p = it.next();
            System.out.println(p);
        }

        for(Point p : c){
            System.out.println(p);
        }











        /*
        Collection<String> c = new ArrayList<>(); //泛型集合
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        //c.add(123); //编译错误，123的类型违背了集合c所指向的泛型的实际类型String

        //迭代器所指定的泛型应当与其遍历的集合的泛型一致
        Iterator<String> it = c.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }

        for(String str : c){
            System.out.println(str);
        }
         */
    }
}
















