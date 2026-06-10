package sum4.model;

public class Magazine extends LibraryItem {
    // TODO: Declare extra field

    public Magazine(String itemId, String title, int issueNumber) {
        // TODO: Implement constructor
        super(null, null);
    }

    // TODO: Implement specific getters/setters

    // TODO: Implement calculateLateFee
    @Override
    public double calculateLateFee(int daysLate) {
        return 0.0;
    }
}