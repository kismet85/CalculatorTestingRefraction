import com.ismet.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(10, calculator.add(7, 3));
        assertEquals(0, calculator.add(0, 0));
        assertEquals(-3, calculator.add(-1, -2));
    }

    @Test
    void testSubtract() {
        assertEquals(4, calculator.subtract(7, 3));
        assertEquals(0, calculator.subtract(0, 0));
        assertEquals(1, calculator.subtract(1, 0));
    }

    @Test
    void testMultiply() {
        assertEquals(21, calculator.multiply(7, 3));
        assertEquals(0, calculator.multiply(0, 7));
        assertEquals(-6, calculator.multiply(-2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(7, 0), "Cannot divide by zero");
    }
}
