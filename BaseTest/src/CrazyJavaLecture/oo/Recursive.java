package CrazyJavaLecture.oo;

/**
 * @DESC
 * @AUTHOR DuXiaojing
 * @CREATE 2018-04-30 11:26
 **/
public class Recursive {
    //已知f(0)=1,f(1)=4，f(n+2)=2*f(n+1)+f(n)
//    public static int fn(int n){
//        if (n == 0){
//            return  1;
//        }else if (n == 1){
//            return 4;
//        }else {
//            return 2*fn(n-1)+fn(n-2);
//        }
//    }
    public static void main(String[] args) {
        System.out.println(fn(10));
    }
    //已知f(20)=1,f(21)=4,f(n+2)=2*f(n+1)+f(n)
    public static int fn(int n){
        if (n == 20){
            return  1;
        }else if (n == 21){
            return 4;
        }else {
            return fn(n+2)-2*fn(n+1);
        }
    }
}
