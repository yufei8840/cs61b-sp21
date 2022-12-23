package flik;
import org.junit.Assert.*;
/** An Integer tester created by Flik Enterprises.
 * @author Josh Hug
 * */
public class Flik {
    /** @param a Value 1
     *  @param b Value 2
     *  @return Whether a and b are the same */
    // 接收的参数改为int基本数据类型，或者是调用Integer的equals方法；
    // 错误在于传入参数是类对象，却进行了等号比较，实际上他们的内存地址不一样，输出是仍然是500,但是确实引用类型；










    public static boolean isSameNumber(int a, int b) {
        return a == b;
    }










//    public static boolean isSameNumber(Integer a, Integer b) {
//        return a.equals(b);
//    }
}
