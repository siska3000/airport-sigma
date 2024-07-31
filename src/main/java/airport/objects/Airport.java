package airport.objects;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private Integer airportId;
    private String name;
    private List<Plane> planes = new ArrayList<>();
    private Integer coordinates;

    public Integer getAirportId() {
        return airportId;
    }
    public String getName() {
        return name;
    }

    public List<Plane> getPlanes() {
        return planes;
    }


    public Airport(Integer airportId, String name, List<Plane> planes, Integer coordinates) {
        this.airportId = airportId;
        this.name = name;
        this.planes = planes;
        this.coordinates = coordinates;

    }
    public Integer getCoordinates() {
        return coordinates;
    }
    


}
