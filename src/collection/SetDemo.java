package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/** Set集合的演示 */
public class SetDemo {
    public static void main(String[] args) {
        //小面试题:如何去重?
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("two");
        System.out.println("list:"+list); //[one, two, three, four, five, two]

        Set<String> set = new HashSet<>();
        set.addAll(list); //将list集合元素都添加到set集合中
        System.out.println("set:"+set); //[four, one, two, three, five]

        /*
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
        set.add("two"); //无法被正确添加进去，因为Set集是不可重复集合，并且大部分都无序
        System.out.println(set);
         */
    }
}

























