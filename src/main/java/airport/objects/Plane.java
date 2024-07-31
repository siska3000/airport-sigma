package airport.objects;

import java.util.ArrayList;
import java.util.List;

public class Plane {

    private Integer planeId;
    private String model;
    private Airport location;
    private Airport destination;
    private Integer fuel;
    private List<Passenger> passengers = new ArrayList<>();
    private List<Luggage> luggagers = new ArrayList<>();



    public List<Luggage> getLuggages() {
        return luggagers;
    }
    
    public List<Passenger> getPassengers() {
        return passengers;
    }
    public Integer getPlaneId() {
        return planeId;
    }
    public String getModel() {
        return model;
    }
    public Airport getLocation() {
        return location;
    }
    public Airport getDestination() {
        return destination;
    }
    
    
    public Plane(Integer planeId, String model, Airport location, Airport destination, Integer fuel) {
        this.planeId = planeId;
        this.model = model;
        this.location = location;
        this.destination = destination;
        this.fuel = fuel;

     
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public void setLuggagers(List<Luggage> luggagers) {
        this.luggagers = luggagers;
    }

    public void setLocation(Airport location) {
        this.location = location;
    }
    public void setDestination(Airport destination) {
        this.destination = destination;
    }
    public void setFuel(Integer fuel) {
        this.fuel = fuel;
    }
    public Integer getFuel() {
        return fuel;
    }

}
