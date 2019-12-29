public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(20);
        bookShelf.appendBook(new Book("C语言从入门到精通"));
        bookShelf.appendBook(new Book("Java核心技术I"));
        bookShelf.appendBook(new Book("计算机组成原理"));
        bookShelf.appendBook(new Book("计算机网络"));
        bookShelf.appendBook(new Book("C语言从入门到精通"));
        bookShelf.appendBook(new Book("Java核心技术I"));
        bookShelf.appendBook(new Book("计算机组成原理"));
        bookShelf.appendBook(new Book("计算机网络"));
        bookShelf.appendBook(new Book("C语言从入门到精通"));
        bookShelf.appendBook(new Book("Java核心技术I"));
        bookShelf.appendBook(new Book("计算机组成原理"));
        bookShelf.appendBook(new Book("计算机网络"));
        bookShelf.appendBook(new Book("C语言从入门到精通"));
        bookShelf.appendBook(new Book("Java核心技术I"));
        bookShelf.appendBook(new Book("计算机组成原理"));
        bookShelf.appendBook(new Book("计算机网络"));
        bookShelf.appendBook(new Book("C语言从入门到精通"));
        bookShelf.appendBook(new Book("Java核心技术I"));
        bookShelf.appendBook(new Book("计算机组成原理"));
        bookShelf.appendBook(new Book("计算机网络"));
        Iterator iterator=bookShelf.iterator();
        while(iterator.hasNext()){
            Book book=(Book)iterator.next();
            System.out.println(book);
        }
        iterator.next();
    }
}
