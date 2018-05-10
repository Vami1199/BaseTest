package CrazyJavaLecture.oo;

/**
 * @DESC 交换值
 * @AUTHOR DuXiaojing
 * @CREATE 2018-04-28 16:19
 **/
public class PerimitiveTransferTest {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("swap方法里，a的值是" + a + ":b的值是：" + b);
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        swap(a, b);
        System.out.println("交换后，变量a的值为：" + a + "变量b的值为：" + b);
    }
}
