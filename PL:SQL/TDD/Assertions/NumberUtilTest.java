import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberUtil {

    boolean isPositive(int n) {
        return n > 0;
    }

    String getName() {
        return "CTS";
    }

    String getValue() {
        return null;
    }
}

public class NumberUtilTest {

    NumberUtil n = new NumberUtil();

    @Test
    void testAssertions() {

        assertTrue(n.isPositive(10));
        assertFalse(n.isPositive(-5));

        assertEquals("CTS", n.getName());

        assertNotNull(n.getName());

        assertNull(n.getValue());
    }
}