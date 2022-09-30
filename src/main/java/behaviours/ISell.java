package behaviours;

import Instruments.MusicInstrument;

public interface ISell {

    default int markUp(){
        return 0;
    }
}
