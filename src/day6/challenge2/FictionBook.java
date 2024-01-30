package day6.challenge2;

public class FictionBook extends Book {
    private String genre;

    public FictionBook(String title, String author, String isbn, String genre) {
        super(title, author, isbn);
        this.genre = genre;
    }
    public String getBookInfo() {
        return super.getBookInfo() + ", Genre: " + genre;
    }
}
