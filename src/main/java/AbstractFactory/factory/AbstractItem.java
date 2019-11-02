package AbstractFactory.factory;

import lombok.AllArgsConstructor;

/**
 * 方便统一处理Link和Tray类
 *
 * @author ningxy
 * @date 2019/10/28
 */
@AllArgsConstructor
public abstract class AbstractItem {
    protected String caption;

    public abstract String makeHTML();
}
