package adapter.sample2;

import lombok.AllArgsConstructor;

/**
 * @author ningxy
 * @date 2019/10/19
 */
@AllArgsConstructor
public class Banner {
    private String string;

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
