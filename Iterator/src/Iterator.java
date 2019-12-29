/**
 * 迭代器接口定义了两个方法：
 * hasNext()用来判断是否还有下一个元素
 * next()用来返回当前指向的元素，并让指针后移
 */
public interface Iterator {
    boolean hasNext();
    Object next();
}
