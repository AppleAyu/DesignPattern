public class BookShelf implements Aggregate{
    Book []books;
    int last;
    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
        this.last=0;
    }
    public Book getBookAt(int index){
        return this.books[index];
    }
    public void appendBook(Book  book){
        this.books[last]=book;
        this.last++;
    }
    public int getLength(){
        return this.last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
