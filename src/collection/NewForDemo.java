package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 增强型for循环:新循环
 */
public class NewForDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four","five"};
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        for(String str : array){ //str表示的就是数组中的每个元素
            System.out.println(str);
        }

        Collection c = new ArrayList();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        Iterator it = c.iterator();
        while(it.hasNext()){
            String str = (String)it.next();
            System.out.println(str);
        }
        for(Object obj : c){ //obj代表集合中的每个元素
            String str = (String)obj;
            System.out.println(str);
        }

    }
}























