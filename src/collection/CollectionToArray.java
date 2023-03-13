package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/** 集合转换为数组 */
public class CollectionToArray {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c); //[one, two, three, four, five]

        //若参数数组元素个数==集合元素个数，那就正常转换
        //若参数数组元素个数<集合元素个数，那也正常转换(按照集合大小给数组)
        //若参数数组元素个数>集合元素个数，那也正常转换，同时在末尾补默认值
        String[] array = c.toArray(new String[5]);
        System.out.println(Arrays.toString(array)); //[one, two, three, four, five]

    }
}

















