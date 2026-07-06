import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoanTest {
    private Loan loan;

    @BeforeEach
    void setUp() {
        loan = new Loan("M123", "B456", "2026-07-05", "2026-07-12");
    }

    @Test
    void testConstructor() {
        assertEquals("M123", loan.getMemberId());
        assertEquals("B456", loan.getBookId());
        assertEquals("2026-07-05", loan.getLoanDate());
        assertEquals("2026-07-12", loan.getDueDate());
        assertTrue(loan.isActive());
    }

    @Test
    void testCloseLoan() {
        loan.closeLoan();
        assertFalse(loan.isActive());
    }
}