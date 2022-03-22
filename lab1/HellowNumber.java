package lab1;
public class HellowNumber {
    public static void main(String[] args) {
        int x;
        x = 0;
        while (x < 10) {
            System.out.println(x);
            x = x + 1;

        }
    }
}


/** 
 * 静态类型语言:
 * 变量类型可以永远不变
 * 使用时必须先声明
 * 在编译之前类会进行类型验证,如果有类型错误则无法执行(编译)
*/