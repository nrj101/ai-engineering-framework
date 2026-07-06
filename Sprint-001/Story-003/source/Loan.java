/**
 * Represents a Loan Aggregate in the Library Lending System.
 * A Loan represents the lending of one Book to one Member.
 */
public class Loan {
    private final String memberId;
    private final String bookId;
    private final String loanDate;
    private final String dueDate;
    private boolean isActive;

    /**
     * Constructs a new Loan.
     *
     * @param memberId  The ID of the Member borrowing the Book.
     * @param bookId    The ID of the Book being loaned.
     * @param loanDate  The date the Book was loaned.
     * @param dueDate   The date the Book is due for return.
     */
    public Loan(String memberId, String bookId, String loanDate, String dueDate) {
        this.memberId = memberId;
        this.bookId = bookId;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.isActive = true;
    }

    /**
     * Gets the ID of the Member borrowing the Book.
     *
     * @return The Member ID.
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * Gets the ID of the Book being loaned.
     *
     * @return The Book ID.
     */
    public String getBookId() {
        return bookId;
    }

    /**
     * Gets the date the Book was loaned.
     *
     * @return The Loan Date.
     */
    public String getLoanDate() {
        return loanDate;
    }

    /**
     * Gets the date the Book is due for return.
     *
     * @return The Due Date.
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Gets the current status of the Loan.
     *
     * @return true if the Loan is active, false otherwise.
     */
    public boolean isActive() {
        return isActive;
    }

    /**
     * Marks the Loan as closed (returned).
     */
    public void closeLoan() {
        this.isActive = false;
    }
}