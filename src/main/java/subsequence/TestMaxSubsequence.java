package subsequence;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMaxSubsequence {
    static Map<Integer[], Integer> testCases = new HashMap<>();

    @BeforeClass
    public static void setUp() {
        testCases.put(new Integer[] { 1, -5, 2, -1, 5, 6, 3, -6, 4 }, 15);
        testCases.put(new Integer[] { 6, -5, 2, -1, 5, 6, 3, -6, 14 }, 24);
        testCases.put(new Integer[] { 11, -5, 2, -100, 5, 6, 3, -6, 4 }, 14);
        testCases.put(new Integer[] { 1000, -5000, 2, -100, 5, -6, 4 }, 1000);
        testCases.put(new Integer[] { 100, -15, 2, -1, 5, 16, 3, -6, 4 }, 110);
    }

    @Test
    public void testScan() {
        for (Map.Entry<Integer[], Integer> entry : testCases.entrySet()) {
            assertEquals(MaxSubsequence.scan(entry.getKey()), entry.getValue());
        }
    }

    @Test
    public void testDevideAndConquer() {
        for (Map.Entry<Integer[], Integer> entry : testCases.entrySet()) {
            assertEquals(MaxSubsequence.devideAndConquer(entry.getKey()),
                    entry.getValue());
        }
    }

    @Test
    public void testSimple() {
        for (Map.Entry<Integer[], Integer> entry : testCases.entrySet()) {
            assertEquals(MaxSubsequence.simple(entry.getKey()), entry.getValue());
        }
    }

    @Test
    public void testQuadratic() {
        for (Map.Entry<Integer[], Integer> entry : testCases.entrySet()) {
            assertEquals(MaxSubsequence.quadratic(entry.getKey()), entry.getValue());
        }
    }

}
