package CrazyJavaLecture.oo;

/**
 * @DESC
 * @AUTHOR DuXiaojing
 * @CREATE 2018-04-30 14:13
 **/
public class PersonTest {
    public static void main(String[] args) {
        System.out.println("Person的eyeNum类变量值：" + Person.eyeNum);
        Person p = new Person();
        System.out.println("p变量的name变量为" + p.name + "p变量的eyeNum变量为：" + Person.eyeNum);
        p.name = "啦啦啦啦";
        Person.eyeNum=2;
        System.out.println("p变量的name变量为" + p.name + "p变量的eyeNum变量为：" + Person.eyeNum);
        System.out.println("p变量的eyeNum变量为：" + Person.eyeNum);
        Person p2 = new Person();
        System.out.println("p变量的eyeNum变量为：" + Person.eyeNum);

    }
}
