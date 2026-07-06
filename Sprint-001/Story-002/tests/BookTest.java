import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void shouldRegisterBookSuccessfully() {

        Book book = new Book("Clean Code");

        assertNotNull(book.getBookId());
        assertEquals("Clean Code", book.getTitle());
        assertTrue(book.isAvailable());
    }

    @Test
    void shouldRejectBlankBookTitle() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Book("")
        );
    }

    @Test
    void shouldRejectNullBookTitle() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Book(null)
        );
    }

    @Test
    void shouldMarkBookUnavailable() {

        Book book = new Book("Clean Code");

        book.markUnavailable();

        assertFalse(book.isAvailable());
    }

    @Test
    void shouldMarkBookAvailable() {

        Book book = new Book("Clean Code");

        book.markUnavailable();
        book.markAvailable();

        assertTrue(book.isAvailable());
    }
}