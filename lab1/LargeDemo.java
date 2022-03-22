package lab1;
public class LargeDemo {
    public static int large(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }
    public static void main(String[] args) {
        System.out.println(large(5,-10));
        }
}



/**
 * 函数定义使用public static
 * 输入的参数类型和返回类型都需要提前指定
 * 与python相比java的方法必须在类中
 * 
 * 缺点:
 * 不能整数和小数进行比较(不需要写单独的处理函数)
 * 冗长不通用
 * 
 * 优点:
 * 捕获类型错误,更容易调试
 * 更容易阅读
 * 类型错误永远不会发生在终端用户上
 * 执行更快(没有类型检查type check)
 */