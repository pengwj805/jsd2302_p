package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/** List集合的演示 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("one");
        System.out.println("list:"+list); //[one, two, three, four, five, one]

        //E get(int index):获取指定下标所对应的元素
        String e = list.get(2);
        System.out.println(e); //three
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        for(String s : list){
            System.out.println(s);
        }

        System.out.println("-----------------------------");

        /*
          E set(int index, E e):
          将给定元素设置到指定位置，返回被替换的元素
         */
        //list.set(2,"six"); //将list中下标为2的元素设置为six---常规用法
        String old = list.set(2,"six"); //将list中下标为2的元素设置为six，同时将原数据返回old
        System.out.println("list:"+list); //[one, two, six, four, five, one]
        System.out.println(old); //three

        /*
          E remove(int index):
          删除指定位置元素，并返回指定位置元素
         */
        //list.remove(2); //删除下标为2的元素---常规用法
        String s = list.remove(2); //删除下标为2的元素，并将被删除元素返回给s
        System.out.println("list:"+list); //[one, two, four, five, one]
        System.out.println(s); //six

        /*
          void add(int index,E e):
          将给定元素e添加到index所指定的位置，相当于插入操作
         */
        list.add(3,"seven"); //在list下标为3的位置插入seven
        System.out.println(list); //[one, two, four, five, one]

    }
}



















