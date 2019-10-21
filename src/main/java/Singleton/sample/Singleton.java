package Singleton.sample;

/**
 * @author ningxy
 * @date 2019/10/21
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("生成了一个Singleton实例");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
