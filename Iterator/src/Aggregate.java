/**
 * Aggregate接口中有一个方法，用来返回对应集合迭代器，因此实现的类应该是一个集合
 */
public interface Aggregate {
    Iterator iterator();
}
