package sum4.model;

public abstract class LibraryItem {
    // TODO: Declare private fields
    private String itemId;
    private String title;
    private boolean available;

    // TODO: Implement constructor
    public LibraryItem(String itemId, String title){
        this.itemId = itemId;
        this.title = title;
        this.available = true;
    }

    // TODO: Implement getters and setters

    public String itemId() {
        return itemId;
    }

    public String title() {
        return title;
    }

    public boolean available() {
        return available;
    }

    public void setAvailable(boolean available){
        this.available = available;
    }

    // TODO: Declare abstract calculateLateFee method
    public abstract double calculateLateFee(int daysLate);
}