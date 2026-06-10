package sum4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sum4.model.*;
import sum4.service.Library;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Library Service Tests")
class LibraryTest {

    private Library library;
    private Member member;
    private LibraryItem item1;
    private LibraryItem item2;

    @BeforeEach
    void initContext() {
        library = new Library("Johannesburg Central Library");
        member = new Member("MEM-10", "Lerato Molefe");
        item1 = new Book("B-1", "Introduction to Algorithms", "Cormen");
        item2 = new Magazine("M-1", "National Geographic", 220);

        library.addItem(item1);
        library.addItem(item2);
    }

    @Test
    @DisplayName("Lending check-out records transactions and locks items")
    void testCheckoutService() {
        Loan loan = library.loanItem(member.memberId(), "B-1", 7);
        assertNotNull(loan);
        assertFalse(item1.available());
        assertEquals(1, library.loans().size());
    }

    @Test
    @DisplayName("Attempting to lock missing resources triggers validation failures")
    void testLendingValidationFailure() {
        assertThrows(IllegalArgumentException.class, () -> {
            library.loanItem(member.memberId(), "INVALID-ID", 5);
        });
    }

    @Test
    @DisplayName("Fulfilling return cycles clears record status and updates availability")
    void testReturnServicePipeline() {
        Loan loan = library.loanItem(member.memberId(), "M-1", 5);
        int generatedId = loan.loanId();

        Loan finalizedLoan = library.returnItem(generatedId);
        assertEquals(Loan.LoanStatus.RETURNED, finalizedLoan.status());
        assertTrue(item2.available());
    }
}