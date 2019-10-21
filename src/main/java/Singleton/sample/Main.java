package Singleton.sample;

/**
 * @author ningxy
 * @date 2019/10/21
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1.equals(singleton2)) {
            System.out.println("singleton1 和 singleton2 是相同的实例");
        } else {
            System.out.println("singleton1 和 singleton2 是不同的实例");
        }

        System.out.println("End.");
    }
}
