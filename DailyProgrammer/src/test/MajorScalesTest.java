package test;

import main.MajorScales;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorScalesTest {

    @Test
    public void testMajorScales(){
        MajorScales test = new MajorScales();
        assertEquals("C", test.note("C", "Do"));
        assertEquals("D", test.note("C", "Re"));
        assertEquals("E", test.note("C", "Mi"));
        assertEquals("F#", test.note("D", "Mi"));
        assertEquals("D#", test.note("A#", "Fa"));
    }
}
