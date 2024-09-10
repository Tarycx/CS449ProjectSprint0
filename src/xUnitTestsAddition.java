import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class xUnitTestsAddition { //Test File Using JUnit 4

    private Addition addition;

    @Before
    public void setUp() {
        addition = new Addition();
    }

    @Test //JUnit Test 1
    public void testAdd() {
        int result = addition.add(2, 3);
        assertEquals(5, result);
    }

    @Test //JUnit Test 2
    public void testAddNegativeNumbers() {
        int result = addition.add(-2, -3);
        assertEquals(-5, result);
    }
}