package sum4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sum4.model.Book;
import sum4.model.LibraryItem;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("LibraryItem Tests")
class LibraryItemTest {

    @Test
    @DisplayName("Constructor maps fields accurately and sets availability to true")
    void testItemInitialization() {
        LibraryItem item = new Book("B-100", "Object Oriented Design", "Robert Martin");
        assertEquals("B-100", item.itemId());
        assertEquals("Object Oriented Design", item.title());
        assertTrue(item.available(), "New arrivals should default to available");
    }

    @Test
    @DisplayName("Availability updates correctly")
    void testStateChangeMutator() {
        LibraryItem item = new Book("B-101", "Clean Code", "Robert Martin");
        item.setAvailable(false);
        assertFalse(item.available());
    }
}