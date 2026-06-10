# Library Management System — Java OOP Assessment (oop-003-library.v1)

## Implementation Steps

### Step 1 — Implement `LibraryItem` (Abstract Class)
`LibraryItem` is the abstract parent class for every item in the library.

**Fields:**
* `itemId` (String) - Unique identifier. Private and immutable.
* `title` (String) - Item title. Private and immutable.
* `available` (boolean) - Defaults to true. Private.

**Constructor:** Accepts `itemId` and `title`. Sets `available` to `true`.

**Methods:**
* `itemId()`
* `title()`
* `available()`
* `setAvailable(boolean)`
* `public abstract double calculateLateFee(int daysLate);`

### Step 2 — Implement Item Subclasses
Each subclass extends `LibraryItem`, adds one type-specific field, and implements `calculateLateFee()`.

**1. Book**
* Extra Field: `author` (String)
* Methods: `author()`, `setAuthor(String author)`
* Daily Late Fee: R5.00

**2. Magazine**
* Extra Field: `issueNumber` (int)
* Methods: `issueNumber()`, `setIssueNumber(int issueNumber)`
* Daily Late Fee: R2.00

**3. Newspaper**
* Extra Field: `publicationDate` (String)
* Methods: `publicationDate()`, `setPublicationDate(String publicationDate)`
* Daily Late Fee: R1.00

### Step 3 — Implement `Member`
**Fields:**
* `memberId` (String) - Private and immutable.
* `fullName` (String) - Private and immutable.

**Methods:**
* `memberId()`
* `fullName()`
* `toString()`

### Step 4 — Implement `Loan`
**Nested Enum:** Create `public enum LoanStatus { ACTIVE, RETURNED, OVERDUE }`

**Fields:** `loanId` (int), `member` (Member), `item` (LibraryItem), `daysBorrowed` (int), `status` (LoanStatus).

**Methods:**
* Accessors for all fields (`loanId()`, `member()`, etc.)
* `updateStatus(LoanStatus status)`
* `calculatePenalty()` - Evaluates the late fee using the item's rules. *Assume an item is late if `daysBorrowed` exceeds 14 days.*
* `returnItem()` - Sets status to `RETURNED` and marks the item as available.

### Step 5 — Implement `Library`
The Library service manages all items and loans.

**Fields:** `libraryName` (String), `items` (List), `loans` (List), `loanCounter` (int).

**Methods:**
* `addItem(LibraryItem item)`
* `items()`
* `availableItems()`
* `loanItem(String memberId, String itemId, int days)`
* `returnItem(int loanId)`
* `loans()`
* `libraryName()`

---

## UML Class Diagram
Produce a UML class diagram using Draw.io showing your entire domain model layout. Include class names, fields, methods, access modifiers, inheritance, and associations.
Export as `uml.pdf` or `uml.png` and place in the root directory.

---

## Theory Questions
Create a file named `answers.txt`. Do not change the format.

### Question 1
Explain Encapsulation and Inheritance. Provide one example of each from your solution. (4 Marks)

### Question 2
Explain the difference between a High-Level Language and a Low-Level Language. Provide one example of each. (4 Marks)

### Question 3
What is Maven and why is it considered a Build Tool? (3 Marks)

### Question 4
What problem does Version Control solve? List three Git commands and explain their purpose. (4 Marks)

---

## Design Documentation
Create `design.md` and include:
- Problem Statement
- Assumptions
- Class Responsibilities
- Future Enhancements