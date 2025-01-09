package TrafficManagement;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;


class RoadNetwork {
    private Map<String, List<String>> network;

    public RoadNetwork() {
        this.network = new HashMap<>();
    }

    public void addIntersection(String name) {
        network.putIfAbsent(name, new ArrayList<>());
    }

    public void addRoad(String from, String to) {
        network.get(from).add(to);
    }

    public void displayNetwork() {
        System.out.println("Road Network:");
        network.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
