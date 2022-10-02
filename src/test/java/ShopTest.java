import Instruments.Guitar;
import Instruments.InstrumentType;
import Instruments.Piano;
import Instruments.Trumpet;
import Products.DrumSticks;
import Products.Plectrum;
import behaviours.ISell;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;
    Trumpet trumpet;
    DrumSticks drumSticks;
    Plectrum plectrum;

    @Before
    public void before(){
        shop = new Shop("Navid's");
        guitar = new Guitar("Telecaster", 400, 600, InstrumentType.STRING, "Electric", 6);
        piano = new Piano("Yamaha", 800, 1000, InstrumentType.PERCUSSION, 88, "Grand");
        trumpet = new Trumpet("Lisa Simpsons", 250, 325, InstrumentType.WOODWIND, 4);
        drumSticks = new DrumSticks("Wooden ones", 10, 20, 2);
        plectrum = new Plectrum(1, 3, "Plastic");
    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, shop.itemsInStock());
    }

    @Test
    public void canAddItemsToStock(){
        shop.addItem(guitar);
        assertEquals(1, shop.itemsInStock());
    }

    @Test
    public void canSellItems(){
        shop.addItem(guitar);
        shop.addItem(drumSticks);
        shop.sellItem(guitar);
        assertEquals(1, shop.itemsInStock());
        assertEquals(true, shop.getStock().contains(drumSticks));
    }

    @Test
    public void canGetMarkup(){
        assertEquals(200, guitar.markUp());
    }

    @Test
    public void calculateProfit(){
        shop.addItem(guitar);
        shop.addItem(drumSticks);
        shop.addItem(piano);
        shop.addItem(trumpet);
        shop.addItem(plectrum);
        assertEquals(487, shop.findProfit());
    }
}
