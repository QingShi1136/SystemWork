package Ex82;

public abstract class BookDecorator implements Book{
    private Book book;
    public  BookDecorator(Book book){
        //初始化包装对象
        this.book=book;
    }
    @Override
    public String BorrowBook() {
        //借书方法
        return book.BorrowBook();
    }

    @Override
    public String ReturnBook() {
        //还书方法
        return book.ReturnBook();
    }

}
