public class Main {
    public static void main(String[] args) {
        // Create a GoodDay object
        GoodDay day1 = new GoodDay();
        System.out.println("Day 1: " + day1.toString());

        // Create a GoodDay object with custom values
        GoodDay day2 = new GoodDay(75, 50.0, true, "Pizza");
        System.out.println("\nDay 2: " + day2.toString());

        // Test the reset functionality
        day2.resetDay();
        System.out.println("\nAfter resetting Day 2: " + day2.toString());

        // Test different values for another day
        GoodDay day3 = new GoodDay(89, 80.0, false, "Salad");
        System.out.println("\nDay 3: " + day3.toString());
    }
}
