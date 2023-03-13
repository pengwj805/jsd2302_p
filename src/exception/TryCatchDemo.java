package exception;

/**
 * java异常处理机制: try...catch
 * try{
 *     代码片段
 * }catch(XXXException e){
 *     当try的代码片段出现XXXException时的补救措施
 * }
 */
public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了...");

        try{
            /*
              try块中某句代码如果出现了异常，那么try块中这句代码以下的代码都不执行了
              try语句中如果不出现异常，catch块不执行
             */
            //String line = null;
            //System.out.println(line.length());
            //String line1 = ""; //因为上一句发生了异常，所以try块中此句及以下代码都不会被执行了
            //System.out.println(line1.charAt(0));
            String line2 = "abc";
            System.out.println(Integer.parseInt(line2));
        }catch(NullPointerException e){ //捕获空指针异常
           System.out.println("出现了空指针异常并解决了"); //处理办法
        }catch(StringIndexOutOfBoundsException e){ //捕获字符串下标越界异常
           System.out.println("出现了字符串下标越界异常并解决了"); //处理办法
        //}catch(NullPointerException | StringIndexOutOfBoundsException e){ //若多个异常具有相同处理方式时，可以合并到一个catch中进行处理
        //   System.out.println("出现空指针或字符串下标越界异常并解决了");
        //}catch(Exception e){ //可以在最后捕获超类型异常，凡是该异常的子类型都可以被捕获并处理
        //    System.out.println("反正就是出了个错并解决了");
        }

        System.out.println("程序结束了...");
    }
}


















