package Instruments;

public class Piano extends MusicInstrument {

    private Integer numberOfKeys;
    private String pianoType;

    public Piano(String name, Integer buyingPrice, Integer sellingCost, InstrumentType instrumentType, Integer numberOfKeys, String pianoType) {
        super(name, buyingPrice, sellingCost, instrumentType);
        this.numberOfKeys = numberOfKeys;
        this.pianoType = pianoType;
    }

    public Integer getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(Integer numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    public String getPianoType() {
        return pianoType;
    }

    public void setPianoType(String pianoType) {
        this.pianoType = pianoType;
    }
}
