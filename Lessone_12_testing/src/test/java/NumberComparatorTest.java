import org.example.NumberComparator;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class NumberComparatorTest {
    @Test
    public void testFirstGreater() {
        assertEquals(NumberComparator.compare(5, 3), "5 больше чем 3");
    }

    @Test
    public void testSecondGreater() {
        assertEquals(NumberComparator.compare(3, 5), "3 меньше чем 5");
    }

    @Test
    public void testEqualNumbers() {
        assertEquals(NumberComparator.compare(5, 5), "Числа равны");
    }
}