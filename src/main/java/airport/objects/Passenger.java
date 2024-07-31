package airport.objects;

public class Passenger {
    private Integer id;
    private String passport;
    private Luggage luggageId;
    private String name;

    public Integer getId() {
        return id;
    }

    public String getPassport() {
        return passport;
    }

    public Luggage getLuggageId() {
        return luggageId;
    }

    public String getName() {
        return name;
    }

    public Passenger(Integer id, String passport, Luggage luggageId, String name) {
        this.id = id;
        this.passport = passport;
        this.luggageId = luggageId;
        this.name = name;
    }

}
