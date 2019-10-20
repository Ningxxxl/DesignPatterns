/**
 * 适配器(包装器)模式 Adapter(Wrapper)
 * <p>
 * 该模式分2类：
 * <ol>
 *     <li>类适配器模式（使用继承的适配器）</li>
 *     <li>对象适配器模式（使用委托的适配器）</li>
 * </ol>
 * <p>
 * 主要角色：
 * <ol>
 *     <li>Target（对象）：负责定义所需方法</li>
 *     <li>Adapt-ee（被适配）：持有既定的方法</li>
 *     <li>Adapter（适配器）</li>
 *     <li>Client（请求者）</li>
 * </ol>
 *
 * @author ningxy
 * @date 2019/10/19
 */
package Adapter;