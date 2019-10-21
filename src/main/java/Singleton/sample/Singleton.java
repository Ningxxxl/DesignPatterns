package Singleton.sample;

/**
 * 饿汉式单例模式
 *
 * 特点：
 * <ol>
 *     <li>线程安全，调用效率高。</li>
 *     <li>单例对象直接创建完成，实现简单。</li>
 *     <li>可能会造成不必要的资源浪费。</li>
 * </ol>
 *
 * @author ningxy
 * @date 2019/10/21
 */
public class Singleton {
//    单例对象直接创建完成。
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("生成了一个Singleton实例");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
