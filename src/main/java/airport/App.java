package airport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import airport.objects.Airport;
import airport.objects.Luggage;
import airport.objects.Passenger;
import airport.objects.Plane;
import airport.objects.dispatcher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Luggage luggage1 = new Luggage(1, 32);
        Luggage luggage2 = new Luggage(2, 32);
        Luggage luggage3 = new Luggage(3, 32);
        Luggage luggage4 = new Luggage(4, 32);
        Luggage luggage5 = new Luggage(5, 32);

        Passenger passenger1 = new Passenger(1, "333", luggage1, "Andrian");
        Passenger passenger2 = new Passenger(1, "333", luggage2, "Maria");
        Passenger passenger3 = new Passenger(1, "333", luggage3, "Sasha");
        Passenger passenger4 = new Passenger(1, "333", luggage4, "Grad");
        Passenger passenger5 = new Passenger(1, "333", luggage5, "Oleksa");

        List<Passenger> passengers = new ArrayList<>();

        passengers.add(passenger1);
        passengers.add(passenger2);
        passengers.add(passenger3);
        passengers.add(passenger4);
        passengers.add(passenger5);

   
    

        Airport airport1 = new Airport(1, "New-Yoork", new ArrayList<>(), 1000);
        Airport airport2 = new Airport(1, "Chelsey",  new ArrayList<>(), 1000);
        Airport airport3 = new Airport(1, "Homelander",  new ArrayList<>(), 1000);
        Airport airport4 = new Airport(1, "Ukraine",  new ArrayList<>(), 1000);
        Airport airport5 = new Airport(1, "Deep",  new ArrayList<>(), 1000);

        List<Airport> airports = new ArrayList<>();

        airports.add(airport1);
        airports.add(airport2);
        airports.add(airport3);
        airports.add(airport4);
        airports.add(airport5);

        Plane plane = new Plane(1, "boing747",  airport1, airport2, 500);

        airport1.getPlanes().add(plane);

        List<Plane> planes = new ArrayList<>();
        planes.add(plane);



        Map<Plane, List<Airport>> trip = new HashMap<>();

        trip.put(plane, airports);

        dispatcher dispatcher = new dispatcher(plane, trip);

        dispatcher.onBoard(passengers, plane);

        dispatcher.flyToNextDest(plane);

        





    }
}
