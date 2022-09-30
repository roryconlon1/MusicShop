package behaviours;


public interface IPlay {

    default String play(String data){
        return  "Instrument noise: " + data + ".";
    }
}
