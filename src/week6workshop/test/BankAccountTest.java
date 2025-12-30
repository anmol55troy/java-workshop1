package week6workshop.test;
import week6workshop.BankAccount;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    void testDepositAndWithdraw() {
        BankAccount account = new BankAccount();

        account.deposit(100);
        assertEquals(100, account.getBalance());

        account.withdraw(50);
        assertEquals(50, account.getBalance());

        assertFalse(account.withdraw(60));
        assertEquals(50, account.getBalance());
    }
}
