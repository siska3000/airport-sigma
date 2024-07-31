package airport.objects;

public class Luggage {

    private Integer luggageId;
    private Integer weight;



    public Integer getLuggageId() {
        return luggageId;
    }
    public Integer getWeight() {
        return weight;
    }


    public Luggage(Integer luggageId, Integer weight) {
        this.luggageId = luggageId;
        this.weight = weight;
    }

    

}
