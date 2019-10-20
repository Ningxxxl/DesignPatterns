/**
 * 对象适配器模式（使用委托的适配器）
 * <p>
 * Target(对象)角色和Adapt-ee(被适配)角色都是类
 * <p>
 * PrintBanner类中保存了Banner类的实例，这就形成了委托关系：
 * PrintBanner类的printWeek方法被调用的时候，并非自己处理，而是委托给了其他实例（Banner类实例）的showWithParen方法。
 *
 * @author ningxy
 * @date 2019/10/19
 */
package Adapter.sample2;