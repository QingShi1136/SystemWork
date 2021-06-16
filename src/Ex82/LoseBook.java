package Ex82;

public class LoseBook extends  BookDecorator{
    public LoseBook(Book book) {
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
    public void Lose() {
        //遗失书本方法
    }
}
