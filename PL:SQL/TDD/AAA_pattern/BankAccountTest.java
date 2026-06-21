import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class BankAccount {

    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amt) {
        balance += amt;
    }

    double getBalance() {
        return balance;
    }
}

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setup() {
        account = new BankAccount(1000);
    }

    @AfterEach
    void cleanup() {
        account = null;
    }

    @Test
    void testDeposit() {

        // Arrange
        double amount = 500;

        // Act
        account.deposit(amount);

        // Assert
        assertEquals(1500,
                account.getBalance());
    }
}