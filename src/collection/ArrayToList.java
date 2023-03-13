package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/** 数组转换为集合 */
public class ArrayToList {
    public static void main(String[] args) {
        String[] array = {"one", "two", "three", "four", "five"};
        System.out.println("array:"+ Arrays.toString(array)); //[one, two, three, four, five]

        //asList()方法会返回内部的ArrayList，内部直接引用给定数组array
        List<String> list = Arrays.asList(array);
        System.out.println("list:"+list); //[one, two, three, four, five]

        //对数组操作后，集合也会相应的改变
        array[1] = "six";
        System.out.println("array:"+ Arrays.toString(array));
        System.out.println("list:"+list);

        //对集合操作后，数组也会做相应的改变
        list.set(2,"seven"); //将集合的第3个元素修改为seven
        System.out.println("array:"+ Arrays.toString(array));
        System.out.println("list:"+list);

        //给集合添加/删除元素相当于给数组添加/删除元素
        //而数组是定长的，不会自动扩容/缩容，因此发生不支持操作异常
        list.add("!!!!"); //运行时会发生不支持操作异常
    }
}

























