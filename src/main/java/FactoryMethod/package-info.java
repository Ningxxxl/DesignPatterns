/**
 * 工厂方法模式
 * ——使用Template Method模式来构件实例的工厂
 * <p>
 * Factory Method模式中父类决定实例的生成方式，但并不决定所要生成的具体的类，具体的处理全部交给子类负责。
 * 这样可以将生成实例的框架(framework)和实际负责生成实例的类解耦。
 * <p>
 * 主要角色：
 * <ol>
 *     <li>Creator（创建者）：抽象类，属于框架一方。不用new关键字生成实例，而是通过调用生成实例的专用方法来生成实例。</li>
 *     <li>Product（产品）：抽象类，属于框架一方。定义生成的实例所持有的接口(API)。</li>
 *     <li>ConcreteFactory（具体的创建者）：属于具体加工的一方。</li>
 *     <li>ConcreteProduct（具体的产品）：属于具体加工的一方。</li>
 * </ol>
 *
 * @author ningxy
 * @date 2019/10/21
 */
package FactoryMethod;