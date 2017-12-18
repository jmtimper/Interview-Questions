package ZellersAlgorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZellersAlgorithmTest {

    @Test
    public void testAlgorithm(){
        ZellersAlgorithm test = new ZellersAlgorithm();
        assertEquals("Monday", test.ZellersAlgorithm(2017, 10, 30));
        assertEquals("Monday", test.ZellersAlgorithm(2016, 2, 28));
        assertEquals("Saturday", test.ZellersAlgorithm(2015, 2, 28));
        assertEquals("Thursday", test.ZellersAlgorithm(29, 4, 12));
        assertEquals("Friday", test.ZellersAlgorithm(570, 11, 30));
        assertEquals("Tuesday", test.ZellersAlgorithm(1066, 9, 25));
        assertEquals("Thursday", test.ZellersAlgorithm(1776, 7, 4));
        assertEquals("Monday", test.ZellersAlgorithm(1933, 1, 30));
        assertEquals("Friday", test.ZellersAlgorithm(1953, 3, 6));
        assertEquals("Saturday", test.ZellersAlgorithm(2100, 1, 9));
        assertEquals("Wednesday", test.ZellersAlgorithm(2202, 12, 15));
        assertEquals("Monday", test.ZellersAlgorithm(7032, 3, 26));
    }
}
