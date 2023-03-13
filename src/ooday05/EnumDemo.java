package ooday05;
/** 枚举的演示 */
public class EnumDemo {
    public static void main(String[] args) {
        Season[] seasons = Season.values(); //获取所有枚举的对象
        for(int i=0;i<seasons.length;i++){
            System.out.println(seasons[i]); //输出4个枚举对象(SPRING、SUMMBER、AUTUMN、WINTER)
            System.out.println(seasons[i].getSeasonName()); //输出枚举的名字属性
            System.out.println(seasons[i].getSeasonDesc()); //输出枚举的描述属性
        }

        Season s = Season.WINTER; //获取SPRING对象
        System.out.println(s.getSeasonName()+"，"+s.getSeasonDesc());
        switch (s){
            case SPRING:
                System.out.println("天气"+s.getSeasonDesc()+"，放风筝去喽!");
                break;
            case SUMMER:
                System.out.println("天气"+s.getSeasonDesc()+"，游戏去喽!");
                break;
            case AUTUMN:
                System.out.println("天气"+s.getSeasonDesc()+"摘苹果去喽!");
                break;
            case WINTER:
                System.out.println("天气"+s.getSeasonDesc()+"打雪仗去喽!");
                break;
        }

    }
}


























