package sum4.model;

public class Magazine extends LibraryItem {
    // TODO: Declare extra field
    private int issueNumber;
    private static final double Daily_Late_Fee = 2.00;

    public Magazine(String itemId, String title, int issueNumber) {
        // TODO: Implement constructor
        super(itemId, title);
        this.issueNumber = issueNumber;
    }

    // TODO: Implement specific getters/setters


    public int issueNumber() {
        return issueNumber;
    }

    // TODO: Implement calculateLateFee
    @Override
    public double calculateLateFee(int daysLate) {
        return Daily_Late_Fee * daysLate;
    }
}