package airport.objects;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class dispatcher {
    private Plane plane;
    private Map<Plane, List<Airport>> trip;
    public Plane getPlane() {
        return plane;
    }
    public dispatcher(Plane plane, Map<Plane, List<Airport>> trip) {
        this.plane = plane;
        this.trip = trip;
    }
    public Map<Plane, List<Airport>> getTrip() {
        return trip;
    }


    public void flyToNextDest(Plane plane) {
        if (plane.getFuel() >= plane.getDestination().getCoordinates()) {
            System.out.println("Бензину достатньо взлітаємо!");
           
            plane.setLocation(plane.getDestination());
            System.out.println("Прилетіли, знаходиму інфу щодо нового польоту");
            List<Airport> destionations = trip.get(plane);

            int oldDest = trip.get(plane).indexOf(plane.getDestination());
            
            int newDest = oldDest + 1;
            
            if (destionations.size() >= newDest) {
                
                plane.setDestination(destionations.get(newDest));
                System.out.println("Взлітаємо на новий пункт призначення!");
            } else {

                System.out.println("This plane has been arrived");
            }
            
            plane.setFuel(plane.getFuel() - plane.getDestination().getCoordinates());
            

        } 
        else {
            System.out.println("Not enough fuel!!");

        }


    }

    public void onBoard(List<Passenger> guys, Plane plane) {
        List<Luggage> luggages = guys.stream()
        .map(passeng -> passeng.getLuggageId())
        .collect(Collectors.toList());
        
        plane.setLuggagers(luggages);
        System.out.println("Додано багаж");
        plane.setPassengers(guys);
        System.out.println("Додано пасажирів");
    }

    
}
