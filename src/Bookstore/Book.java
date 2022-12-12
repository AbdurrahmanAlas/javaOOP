package Bookstore;

public class Book {

    private  int no;
    private String bookName;
    private String authorName;
    private int year;
    private  double price;

    @Override
    public String toString() {
        return "Book{" +
                "no=" + no +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public Book(){

    }

    public Book(int no, String bookName, String authorName, int year, double price) {
        this.no = no;
        this.bookName = bookName;
        this.authorName = authorName;
        this.year = year;
        this.price = price;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
