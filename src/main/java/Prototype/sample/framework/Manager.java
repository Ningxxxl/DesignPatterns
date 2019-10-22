package Prototype.sample.framework;

import java.util.HashMap;

/**
 * Clent（使用者）角色
 * <p>
 * 调用createClone方法复制实例的类
 *
 * @author ningxy
 * @date 2019/10/22
 */
public class Manager {
    /**
     * 保存了实例的"名称"和"实例"之间的对应关系
     */
    private HashMap showcase = new HashMap();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoName) {
        Product p = (Product) showcase.get(protoName);
        return p.createClone();
    }
}
