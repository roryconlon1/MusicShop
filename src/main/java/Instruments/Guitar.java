package Instruments;

public class Guitar extends MusicInstrument{

    private String guitarType;
    private int numberOfStrings;

    public Guitar(String name, Integer buyingPrice, Integer sellingCost, InstrumentType instrumentType, String guitarType, int numberOfStrings) {
        super(name, buyingPrice, sellingCost, instrumentType);
        this.guitarType = guitarType;
        this.numberOfStrings = numberOfStrings;
    }

    public String getGuitarType() {
        return guitarType;
    }

    public void setGuitarType(String guitarType) {
        this.guitarType = guitarType;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}
