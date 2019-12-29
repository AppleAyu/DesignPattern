/**
 * Book是书的类，实例化对象就是一本书，功能有限，我们仅为他添加一个name属性，并且重写了toString()方法
 */
public class Book {
    private String name;
    public Book(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
