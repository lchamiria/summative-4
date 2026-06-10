package sum4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sum4.model.Book;
import sum4.model.Magazine;
import sum4.model.Newspaper;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Item Subclass Tests")
class ItemSubclassTest {

    @Test
    @DisplayName("Books accurately evaluate late penalty cost multipliers")
    void testBookPenaltyFee() {
        Book book = new Book("BK-01", "Effective Java", "Joshua Bloch");
        assertEquals(25.00, book.calculateLateFee(5), 0.001);
        assertEquals(0.00, book.calculateLateFee(0), 0.001);
    }

    @Test
    @DisplayName("Magazines accurately evaluate late penalty cost multipliers")
    void testMagazinePenaltyFee() {
        Magazine mag = new Magazine("MAG-01", "IEEE Software", 42);
        assertEquals(10.00, mag.calculateLateFee(5), 0.001);
    }

    @Test
    @DisplayName("Newspapers accurately evaluate late penalty cost multipliers")
    void testNewspaperPenaltyFee() {
        Newspaper paper = new Newspaper("NP-01", "The Mail & Guardian", "2026-06-10");
        assertEquals(3.00, paper.calculateLateFee(3), 0.001);
    }
}