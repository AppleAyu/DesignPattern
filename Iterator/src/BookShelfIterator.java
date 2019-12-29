/**
 * 书籍的迭代器，实现了迭代器的接口中的所有方法
 */
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;//要迭代的集合
    int index;//用来遍历的下标

    /**
     * 构造器，用来指定迭代的集合
     * @param bookShelf 要遍历的集合
     */
    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf=bookShelf;
        this.index=0;
    }

    /**
     * 实现的方法，用来判断是否还有下一个元素
     * @return 一个布尔值，用来表示是否拥有下一个元素
     */
    @Override
    public boolean hasNext() {
        //注意这里的index和getLength()返回值的关系，getLength()返回的是书架当前拥有的书的数量，也就是BookShelf类中的last
        return index < bookShelf.getLength();
    }

    /**
     * @return 返回一个书籍的对象
     */
    @Override
    public Object next() {
        //先保存当前指向的对象
        Book book= this.bookShelf.getBookAt(index);
        //指针后移
        this.index++;
        //再返回刚才保存的数据
        return book;
    }
}
