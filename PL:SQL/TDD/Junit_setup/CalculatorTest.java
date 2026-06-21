import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Calculator {

    int multiply(int a, int b) {
        return a * b;
    }
}

public class CalculatorTest {

    @Test
    void testMultiply() {

        Calculator c = new Calculator();

        int r = c.multiply(5, 6);

        assertEquals(30, r);
    }
}