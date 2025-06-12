package your.package.name;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for the GradeConverter utility class.
 */
public class GradeConverterTest {

    private static final int MAX_SCORE = 100;
    private static final int MIN_A = 90;
    private static final int MIN_B = 80;
    private static final int MIN_C = 70;
    private static final int MIN_D = 60;
    private static final int FAILING_SCORE = 50;
    private static final int OVER_MAX_SCORE = 101;
    private static final int NEGATIVE_SCORE = -10;

    /** Set up before each test. */
    @BeforeEach
    public void setUp() {
        // No initialization needed if convert is static
    }

    /** Tests grade A boundary. */
    @Test
    public void testGradeA() {
        assertEquals("A", GradeConverter.convert(MAX_SCORE));
        assertEquals("A", GradeConverter.convert(MIN_A));
    }

    /** Tests grade B boundary. */
    @Test
    public void testGradeB() {
        assertEquals("B", GradeConverter.convert(MIN_B));
        assertEquals("B", GradeConverter.convert(MIN_B + 1));
    }

    /** Tests grade C boundary. */
    @Test
    public void testGradeC() {
        assertEquals("C", GradeConverter.convert(MIN_C));
    }

    /** Tests grade D boundary. */
    @Test
    public void testGradeD() {
        assertEquals("D", GradeConverter.convert(MIN_D));
    }

    /** Tests failing grade. */
    @Test
    public void testGradeF() {
        assertEquals("F", GradeConverter.convert(FAILING_SCORE));
    }

    /** Tests score above max. */
    @Test
    public void testAboveMaxScore() {
        assertEquals("A", GradeConverter.convert(OVER_MAX_SCORE)); // Assuming 101+ still maps to "A"
    }

    /** Tests negative score. */
    @Test
    public void testNegativeScore() {
        assertEquals("E", GradeConverter.convert(NEGATIVE_SCORE)); // Assuming negatives still fail
    }
}
