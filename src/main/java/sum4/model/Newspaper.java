package sum4.model;

public class Newspaper extends LibraryItem {
    // TODO: Declare extra field
    private String publicationDate;
    private static final double Daily_Late_Fee = 1.00;

    public Newspaper(String itemId, String title, String publicationDate) {
        // TODO: Implement constructor
        super(itemId, title);
        this.publicationDate = publicationDate;
    }

    // TODO: Implement specific getters/setters


    public String publicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    // TODO: Implement calculateLateFee
    @Override
    public double calculateLateFee(int daysLate) {
        return Daily_Late_Fee * daysLate;
    }
}