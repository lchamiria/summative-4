package sum4.model;

public class Loan {

    public enum LoanStatus {
        ACTIVE, RETURNED, OVERDUE
    }

    // TODO: Declare private fields
    private int loanId;
    private Member member;
    private LibraryItem item;
    private int daysBorrowed;
    private LoanStatus status;

    public Loan(int loanId, Member member, LibraryItem item, int daysBorrowed) {
        // TODO: Implement constructor
        this.loanId = loanId;
        this.member = member;
        this.item = item;
        this.daysBorrowed = daysBorrowed;
        this.status = LoanStatus.ACTIVE;
    }

    // TODO: Implement getters and updateStatus()


    public int loanId() {
        return loanId;
    }

    public int daysBorrowed() {
        return daysBorrowed;
    }

    public LoanStatus status() {
        return status;
    }

    public Member member() {
        return member;
    }

    public void updateStatus(LoanStatus status){
        this.status = status;
    }


    // TODO: Implement penalty evaluation logic (threshold = 14 days)
    public double calculatePenalty() {
        return 0.0;
    }

    // TODO: Implement item return operation
    public void returnItem() {
    }
}