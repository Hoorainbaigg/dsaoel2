package TrafficManagement;
import java.util.*;
class Vehicle {
    private String id;
    private boolean isEmergency;

    public Vehicle(String id, boolean isEmergency) {
        this.id = id;
        this.isEmergency = isEmergency;
    }

    public String getId() {
        return id;
    }

    public boolean isEmergency() {
        return isEmergency;
    }
}

// Intersection Class
class Intersection {
    private String name;
    private PriorityQueue<Vehicle> emergencyQueue;
    private Queue<Vehicle> normalQueue;

    public Intersection(String name) {
        this.name = name;
        this.emergencyQueue = new PriorityQueue<>(Comparator.comparing(Vehicle::isEmergency).reversed());
        this.normalQueue = new LinkedList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        if (vehicle.isEmergency()) {
            emergencyQueue.offer(vehicle);
        } else {
            normalQueue.offer(vehicle);
        }
    }

    public void processVehicles() {
        System.out.println("Processing at Intersection: " + name);
        while (!emergencyQueue.isEmpty()) {
            Vehicle v = emergencyQueue.poll();
            System.out.println("Processed Emergency Vehicle: " + v.getId());
        }
        while (!normalQueue.isEmpty()) {
            Vehicle v = normalQueue.poll();
            System.out.println("Processed Normal Vehicle: " + v.getId());
        }
    }
}