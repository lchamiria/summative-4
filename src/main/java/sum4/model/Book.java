package sum4.model;

public class Book extends LibraryItem {
    // TODO: Declare extra field
    private String author;

    public Book(String itemId, String title, String author) {
        // TODO: Implement constructor
        super(null, null);
    }

    // TODO: Implement specific getters/setters


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // TODO: Implement calculateLateFee
    @Override
    public double calculateLateFee(int daysLate) {
        return 0.0;
    }
}