/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package question_three.trainjourney;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class TrainJourney {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to select an option
        System.out.println("Select the option:");
        System.out.println("1. Compute number of stops (Kampala to Kabale)");  // Part (i)
        System.out.println("2. Compute total travel time (Kampala to Kabale)"); // Part (ii)
        System.out.println("3. Compute return journey time (Kabale to Kampala)"); // Part (iii)
        System.out.println("4. Compute arrival time for second coach (Kabale to Kampala)"); // Part (iv)
        int option = scanner.nextInt();

        // Execute the selected option
        switch (option) {
            case 1:
                computeNumberOfStops();  // Part (i)
                break;
            case 2:
                computeTotalTravelTime(); // Part (ii)
                break;
            case 3:
                computeReturnJourneyTime(); // Part (iii)
                break;
            case 4:
                computeSecondCoachArrival(); // Part (iv)
                break;
            default:
                System.out.println("Invalid option selected.");
        }

        scanner.close();
    }

    // Part (i) - Compute number of stops from Kampala to Kabale
    public static void computeNumberOfStops() {
        int totalDistance = 10000;  // Total distance from Kampala to Kabale
        int passengerStopDistance = 150;  // Stop every 150 km for passengers
        int refuelStopDistance = 200;  // Stop every 200 km for refueling

        // Calculate number of stops for passengers and refueling
        int passengerStops = totalDistance / passengerStopDistance;
        int refuelStops = totalDistance / refuelStopDistance;

        // Sum of all stops
        int totalStops = passengerStops + refuelStops;

        System.out.println("Total number of stops from Kampala to Kabale: " + totalStops);
    }

    // Part (ii) - Compute total travel time from Kampala to Kabale
    public static void computeTotalTravelTime() {
        int totalDistance = 10000;  // Total distance from Kampala to Kabale
        int speed = 250;  // Speed of the train in km/h
        int stopTime = 5;  // Each stop takes 5 minutes

        int passengerStopDistance = 150;  // Stop every 150 km for passengers
        int refuelStopDistance = 200;  // Stop every 200 km for refueling

        // Calculate number of stops
        int passengerStops = totalDistance / passengerStopDistance;
        int refuelStops = totalDistance / refuelStopDistance;
        int totalStops = passengerStops + refuelStops;

        // Calculate travel time without stops
        double travelTime = (double) totalDistance / speed;

        // Calculate additional time due to stops (in hours)
        double additionalTime = totalStops * (double) stopTime / 60;

        // Total travel time
        double totalTime = travelTime + additionalTime;

        System.out.println("Total time taken from Kampala to Kabale: " + totalTime + " hours");
    }

    // Part (iii) - Compute return journey time from Kabale to Kampala
    public static void computeReturnJourneyTime() {
        int totalDistance = 10000;  // Total distance from Kabale to Kampala
        int speed = 250;  // Speed of the train in km/h
        int stopTime = 5;  // Each refueling stop takes 5 minutes

        int refuelStopDistance = 200;  // Stop every 200 km for refueling

        // Calculate number of refueling stops
        int refuelStops = totalDistance / refuelStopDistance;

        // Calculate travel time without stops
        double travelTime = (double) totalDistance / speed;

        // Calculate additional time due to stops (in hours)
        double additionalTime = refuelStops * (double) stopTime / 60;

        // Total travel time
        double totalTime = travelTime + additionalTime;

        System.out.println("Total time taken for the return journey from Kabale to Kampala: " + totalTime + " hours");
    }

    // Part (iv) - Compute arrival time for second coach from Kabale to Kampala
    public static void computeSecondCoachArrival() {
        int totalDistance = 10000;  // Total distance from Kabale to Kampala
        double speedInMetersPerSecond = 225.5;  // Speed of the coach in meters/second

        // Convert speed from meters/second to kilometers/hour
        double speedInKilometersPerHour = speedInMetersPerSecond * 3.6;

        // Calculate travel time in hours
        double travelTime = totalDistance / speedInKilometersPerHour;

        // Assume the journey starts at 09:00 hrs
        double startTime = 9.0;  // Start time in hours (9:00 AM)

        // Calculate arrival time
        double arrivalTime = startTime + travelTime;

        System.out.println("The approximate arrival time in hours: " + arrivalTime + " hrs");
    }
}


