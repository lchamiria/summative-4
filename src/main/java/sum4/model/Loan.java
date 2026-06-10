package sum4.model;

public class Loan {

    public enum LoanStatus {
        ACTIVE, RETURNED, OVERDUE
    }

    // TODO: Declare private fields

    public Loan(int loanId, Member member, LibraryItem item, int daysBorrowed) {
        // TODO: Implement constructor
    }

    // TODO: Implement getters and updateStatus()

    // TODO: Implement penalty evaluation logic (threshold = 14 days)
    public double calculatePenalty() {
        return 0.0;
    }

    // TODO: Implement item return operation
    public void returnItem() {
    }
}