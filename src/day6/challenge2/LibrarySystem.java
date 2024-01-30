package day6.challenge2;

public class LibrarySystem {
    public static void main(String[] args) {
        Library myLibrary = new Library();

        myLibrary.addBook(new FictionBook("1984", "George Orwell", "123456789", "Dystopia"));
        myLibrary.addBook(new NonFictionBook("A Brief History of Time", "Stephen Hawking", "987654321", "Science"));

        myLibrary.displayBooks();
    }
}

