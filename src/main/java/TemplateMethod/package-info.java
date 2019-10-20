/**
 * 模板方法模式
 * <p>
 * 父类模板方法中编写了算法，无需再子类中再编写算法。
 * 其中模板方法不应该被重写！(所以不能用接口？接口只能用default修饰但是依然可以被重写修改)
 * <p>
 * 主要角色：
 * <ol>
 *     <li>AbstractClass（抽象类）：负责实现模板方法，同时声明模板方法中使用到的抽象方法。</li>
 *     <li>ConcreteClass（具体类）：负责实现AbstractClass中定义的抽象方法，这些实现的方法将在模板方法中被调用</li>
 * </ol>
 *
 * @author ningxy
 * @date 2019/10/20
 */
package TemplateMethod;