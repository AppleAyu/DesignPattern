/**
 * BookShelf类是用来管理书（Book）类的一个集合，并且实现了Aggregate接口
 */
public class BookShelf implements Aggregate {
    Book[] books;//存放书籍的数组
    int last;//指向书籍的指针

    /**
     * @param maxSize 作为传入的参数，设置书架的最大容量
     */
    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
        this.last = 0;
    }

    /**
     * @param index 获取书籍的下标
     * @return 通过下标索引来获取书籍，如果越界了会返回null值
     */
    public Book getBookAt(int index) {
        try {
            return this.books[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("下标有误！");
            return null;
        }
    }

    /**
     * 向集合中添加书籍，如果满了则会添加失败
     * @param book 要添加的书籍
     */
    public void appendBook(Book book) {
        if (this.books.length == this.last) {
            System.out.println("满了");
            return;
        }
        this.books[last] = book;
        this.last++;
    }

    /**
     * @return 获取当前的书籍总数
     */
    public int getLength() {
        return this.last;
    }

    /**
     * @return 获取一个当前集合的迭代器
     */
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
