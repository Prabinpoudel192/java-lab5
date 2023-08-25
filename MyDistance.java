class Distance {
    private int feet;
    private int inches;

    // Constructor
    public Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    // Method to add two distance objects
    public Distance addDistance(Distance other) {
        int totalFeet = this.feet + other.feet;
        int totalInches = this.inches + other.inches;

        if (totalInches >= 12) {
            totalFeet += totalInches / 12;
            totalInches = totalInches % 12;
        }

        return new Distance(totalFeet, totalInches);
    }

    // Method to display the distance
    public void displayDistance() {
        System.out.println("Distance: " + feet + " feet, " + inches + " inches");
    }
}

public class MyDistance {
    public static void main(String[] args) {
        Distance distance1 = new Distance(5, 8);
        Distance distance2 = new Distance(3, 10);

        System.out.println("Distance 1:");
        distance1.displayDistance();

        System.out.println("Distance 2:");
        distance2.displayDistance();

        Distance sumDistance = distance1.addDistance(distance2);
        System.out.println("Sum of distances:");
        sumDistance.displayDistance();
    }
}
