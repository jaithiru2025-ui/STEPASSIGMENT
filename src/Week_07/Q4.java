package Week_7;

class TrafficLight {
    private final String id;
    private String color;

    TrafficLight(String id) {
        this.id = id;
        this.color = "RED"; // starts on red
    }

    String next() {
        if (color.equals("RED")) {
            color = "GREEN";
        } else if (color.equals("GREEN")) {
            color = "YELLOW";
        } else { // YELLOW
            color = "RED";
        }
        return color;
    }

    String getColor() {
        return color;
    }

    String getId() {
        return id;
    }
}

public class Q4 {
    public static void main(String[] args) {
        TrafficLight t = new TrafficLight("TL-9");

        System.out.println("Start: " + t.getColor());
        System.out.println("next(): " + t.next());
        System.out.println("next(): " + t.next());
        System.out.println("next(): " + t.next());
    }
}