package  sum4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sum4.model.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Loan Lifecycle Tests")
class LoanTest {

    private final Member sampleMember = new Member("M-001", "Sipho Khumalo");
    private final LibraryItem sampleBook = new Book("BK-99", "Refactoring", "Martin Fowler");

    @Test
    @DisplayName("Loans initialize inside expected active states")
    void testLoanCreationState() {
        Loan loan = new Loan(55, sampleMember, sampleBook, 10);
        assertEquals(55, loan.loanId());
        assertEquals(Loan.LoanStatus.ACTIVE, loan.status());
    }

    @Test
    @DisplayName("Overdue penalties evaluate accurately past day 14")
    void testOverdueFinesEvaluation() {
        // Borrowed for 19 days -> 5 days late. Book fee: 5.00 * 5 = R25.00
        Loan overdueLoan = new Loan(56, sampleMember, sampleBook, 19);
        overdueLoan.updateStatus(Loan.LoanStatus.OVERDUE);
        assertEquals(25.00, overdueLoan.calculatePenalty(), 0.001);
    }

    @Test
    @DisplayName("Processing return commands alters status and sets item available")
    void testReturnTransactionFlow() {
        LibraryItem book = new Book("BK-88", "Domain-Driven Design", "Eric Evans");
        book.setAvailable(false);

        Loan loan = new Loan(57, sampleMember, book, 12);
        loan.returnItem();

        assertEquals(Loan.LoanStatus.RETURNED, loan.status());
        assertTrue(book.available());
    }
}