package Instruments;

public class Piano extends MusicInstrument {

    private Integer numberOfKeys;
    private String pianoType;

    public Piano(String name, Integer buyingPrice, Integer sellingCost, InstrumentType instrumentType, Integer numberOfKeys, String pianoType) {
        super(name, buyingPrice, sellingCost, instrumentType);
        this.numberOfKeys = numberOfKeys;
        this.pianoType = pianoType;
    }

}
