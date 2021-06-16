package Ex82;

public class FreezeBook extends BookDecorator{
    public FreezeBook(Book book) {
        super(book);
    }
    public String BorrowBook() {
        //父类借书方法
        return  super.BorrowBook();
    }

    public String ReturnBook() {
        //父类还书方法
        return  super.ReturnBook();
    }
    public void Freeze() {
        //冻结书本方法
    }
}
