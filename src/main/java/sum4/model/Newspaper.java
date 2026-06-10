package sum4.model;

public class Newspaper extends LibraryItem {
    // TODO: Declare extra field

    public Newspaper(String itemId, String title, String publicationDate) {
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