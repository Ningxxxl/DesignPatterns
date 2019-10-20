package Iterator.sample;

/**
 * 遍历集合的接口
 *
 * @author ningxy
 * @date 2019/10/19
 */
public interface Iterator<T> {
    boolean hasNext();

    T next();
}
