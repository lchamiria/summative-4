package sum4.model;

public class Book extends LibraryItem {
    // TODO: Declare extra field
    private String author;
    private static final double Daily_Late_Fee =5.00;

    public Book(String itemId, String title, String author) {
        // TODO: Implement constructor
        super(itemId, title);
        this.author = author;
    }

    // TODO: Implement specific getters/setters


    public String author() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // TODO: Implement calculateLateFee
    @Override
    public double calculateLateFee(int daysLate) {
        return Daily_Late_Fee * daysLate;
    }
}