import Products.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks("Drum sticks", 20, 30, 2);
    }

    @Test
    public void hasNumberInSet(){
        assertEquals(2, drumSticks.getNumberInSet());
    }

    @Test
    public void canSell(){
        assertEquals(10, drumSticks.markUp());
    }
}
