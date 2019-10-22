/**
 * 原型模式
 * ——根据实例生成实例（而非根据类来生成实例）
 * <p>
 * 注意clone()方法是浅拷贝
 * <p>
 * 主要角色：
 * <ol>
 *     <li>Prototype（原型）：负责定义用于复制现有实例来生成新实例的方法。</li>
 *     <li>ConcretePrototype（具体的原型）：负责实现复制现有实例并生成新实例的方法。</li>
 *     <li>Client（使用者）：负责使用复制实例的方法生成新的实例。</li>
 * </ol>
 *
 * @author ningxy
 * @date 2019/10/22
 */
package Prototype;