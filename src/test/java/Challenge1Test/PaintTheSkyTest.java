package Challenge1Test;

import Challenge1.PaintTheSky;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaintTheSkyTest {

    @Test
    public void paintTheSkyTest1(){
        PaintTheSky paintTheSky = new PaintTheSky();
        int[] buildings = {1,2,4,3,5};
        int actual = paintTheSky.paintTheSky(buildings);
        int expected = 6;
        assertEquals(expected, actual);
    }

}
