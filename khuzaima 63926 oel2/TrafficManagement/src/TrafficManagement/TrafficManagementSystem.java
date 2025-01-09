package TrafficManagement;

public class TrafficManagementSystem {
    public static void main(String[] args) {
        
        RoadNetwork roadNetwork = new RoadNetwork();
        roadNetwork.addIntersection("A");
        roadNetwork.addIntersection("B");
        roadNetwork.addIntersection("C");
        roadNetwork.addIntersection("D");
        roadNetwork.addRoad("A", "B");
        roadNetwork.addRoad("B", "C");
        roadNetwork.addRoad("A", "D");
        roadNetwork.addRoad("D", "C");

        roadNetwork.displayNetwork();

      
        Intersection intersectionA = new Intersection("A");
        Intersection intersectionB = new Intersection("B");

        
        intersectionA.addVehicle(new Vehicle("V1", false));
        intersectionA.addVehicle(new Vehicle("V2", true)); 
        intersectionA.addVehicle(new Vehicle("V3", false));

        intersectionB.addVehicle(new Vehicle("V4", true)); 
        intersectionB.addVehicle(new Vehicle("V5", false));

        
        intersectionA.processVehicles();
        intersectionB.processVehicles();

        
        System.out.println("\nTraffic Light Adjustments:");
        System.out.println("Green light at A -> B: 45 seconds");
        System.out.println("Red light at A -> D: 15 seconds");
    }
} 
