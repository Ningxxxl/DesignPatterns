package Singleton.a2;

/**
 * @author ningxy
 * @date 2019/10/21
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            Triple triple = Triple.getInstance(i % 3);
            System.out.println(triple);
        }
    }
}
