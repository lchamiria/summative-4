package sum4.model;

public class Book extends LibraryItem {
    // TODO: Declare extra field

    public Book(String itemId, String title, String author) {
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