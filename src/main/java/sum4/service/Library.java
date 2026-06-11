package sum4.service;

import sum4.model.*;
import java.util.List;
import java.util.ArrayList;

public class Library {
    // TODO: Declare private fields
    private String libraryName;
    private List<LibraryItem> items;
    private List<Loan> loans;
    private int loanCounter;



    public Library(String libraryName, List items, List loans, int loanCounter) {
        // TODO: Initialize fields
        this.items = new ArrayList<>();
        this.libraryName = libraryName;
        this.loanCounter = loanCounter;
        this.loans = new ArrayList<>();
    }

    public List<LibraryItem> items() {
        return items;
    }

    public String libraryName() {
        return libraryName;
    }

    public List<Loan> loans() {
        return loans;
    }

    public int loanCounter() {
        return loanCounter;
    }

    // TODO: Implement addItem, items(), availableItems()

    public void addItem(LibraryItem item){
        this.items.add(item);
    }

    public Loan loanItem(String memberId, String itemId, int days) {
        // TODO: Verify target catalog visibility and perform checkout
        return null;
    }

    public Loan returnItem(int loanId) {
        // TODO: Process return and update item availability
        return null;
    }

    // TODO: Implement loans() and libraryName()
}