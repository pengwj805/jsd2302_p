package exception;

/**
 * finally块的演示
 */
public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了...");

        try{
            //String line = null;
            String line = "";
            System.out.println(line.length());
            return; //在return之前，会先finally再return
        }catch(Exception e){
            System.out.println("出错并解决了");
        }finally {
            System.out.println("finally中的代码执行了");
        }

        System.out.println("程序结束了...");

    }
}














