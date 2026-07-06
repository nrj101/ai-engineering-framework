import java.util.UUID;

public class Book {

    private final UUID bookId;
    private final String title;
    private boolean available;

    public Book(String title) {

        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Book title cannot be null or blank.");
        }

        this.bookId = UUID.randomUUID();
        this.title = title;
        this.available = true;
    }

    public UUID getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void markUnavailable() {
        available = false;
    }

    public void markAvailable() {
        available = true;
    }
}