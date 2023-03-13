package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/** 集合的排序: 整数 */
public class SortInteger {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(rand.nextInt(100));
        }
        System.out.println("list原始数据:"+list); //无序

        Collections.sort(list); //自然排序(从小到大)
        System.out.println("list排序后数据:"+list); //有序(小到大)

        Collections.reverse(list); //反转list集合(数据已经改变了)
        System.out.println("list反转后数据:"+list);
        System.out.println("第1个元素为:"+list.get(0)); //输出第1个元素
    }
}




















