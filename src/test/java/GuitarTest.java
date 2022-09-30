import Instruments.Guitar;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Fender", 100, 150, InstrumentType.STRING, "Electric", 6);
    }

    @Test
    public void canSell(){
        assertEquals(50, guitar.markUp());
    }

    @Test
    public void canPlay(){
        assertEquals("Instrument noise: Guitar noises.", guitar.play("Guitar noises"));
    }

    @Test
    public void hadType(){
        assertEquals(InstrumentType.STRING, guitar.getInstrumentType());
    }

    @Test
    public void hadGuitarType(){
        assertEquals("Electric", guitar.getGuitarType());
    }
}
