package collection;

import java.util.ArrayList;
import java.util.List;

/** subList()方法的演示 */
public class SubListDemo {
    public static void main(String[] args) {
        /*
          List提供了获取子集的操作:
            List subList(int start,int end):含头不含尾
         */
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i*10);
        }
        System.out.println("list:"+list); //[0, 10, 20, 30, 40, 50, 60, 70, 80, 90]

        List<Integer> subList = list.subList(3,8); //获取下标3到7的子集
        System.out.println("subList:"+subList); //[30, 40, 50, 60, 70]

        //将子集每个元素都扩大10倍
        for(int i=0;i<subList.size();i++){
            subList.set(i,subList.get(i)*10);
        }
        System.out.println("subList:"+subList); //[300, 400, 500, 600, 700]
        //注意:对子集的操作就是对原集合对应的元素操作
        System.out.println("list:"+list); //[0, 10, 20, 300, 400, 500, 600, 700, 80, 90]

        list.set(3,1000); //将原集合下标为3的元素的数据修改为1000
        System.out.println("list:"+list); //[0, 10, 20, 1000, 400, 500, 600, 700, 80, 90]
        //原集合数据改变后，子集数据跟着变了
        System.out.println("subList:"+subList); //[1000, 400, 500, 600, 700]

        list.remove(0);
        System.out.println("list:"+list); //[10, 20, 1000, 400, 500, 600, 700, 80, 90]
        //原集合长度修改之后，子集将不能再进行任何操作，操作则发生异常，但是可以重新获取子集
        System.out.println("subList:"+subList); //运行时发生不支持修改异常

    }
}

















