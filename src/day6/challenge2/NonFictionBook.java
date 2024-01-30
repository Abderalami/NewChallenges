package day6.challenge2;

public class NonFictionBook extends Book {
    private String field;

    public NonFictionBook(String title, String author, String isbn, String field) {
        super(title, author, isbn);
        this.field = field;
    }

    @Override
    public String getBookInfo() {
        return super.getBookInfo() + ", Field: " + field;
    }
}
