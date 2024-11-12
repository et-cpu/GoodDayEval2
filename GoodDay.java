/**
 * The GoodDay class represents a day and its various factors (weather, homework completion, and dinner)
 * that determine whether it is a good or bad day.
 */

public class GoodDay {

    // Private properties (fields)
    private int temperature;
    private double humidity;
    private boolean isHomeworkDone;
    private String dinnerMeal;

    /**
     * Initialize all properties to default values:
     * temperature = 0, humidity = 0.0, isHomeworkDone = false, dinnerMeal = "None".
     */

    public GoodDay() {
        this.temperature = 0;
        this.humidity = 0.0;
        this.isHomeworkDone = false;
        this.dinnerMeal = "None";
    }

    /**
     * Constructor to initialize the properties of the GoodDay object
     * with custom values.
     *
     * @param temperature The temperature in F
     * @param humidity The humidity percentage
     * @param isHomeworkDone Boolean indicating if homework is completed.
     * @param dinnerMeal The dinner plan for the day.
     */

    // Initialize fields with custom values
    public GoodDay(int temperature, double humidity, boolean isHomeworkDone, String dinnerMeal) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.isHomeworkDone = isHomeworkDone;
        this.dinnerMeal = dinnerMeal;
    }

    /**
     * Gets the temperature for the day.
     *
     * @return The temperature in F.
     */

    // Getters and setters for each property
    public int getTemperature() {
        return temperature;
    }

    /**
     * Sets the temperature for the day.
     *
     * @param temperature The temperature in F to set.
     */

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    /**
     * Gets the humidity level for the day.
     *
     * @return The humidity percentage.
     */

    public double getHumidity() {
        return humidity;
    }

    /**
     * Sets the humidity level for the day.
     *
     * @param humidity The humidity percentage to set.
     */

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public boolean isHomeworkDone() {
        return isHomeworkDone;
    }

    /**
     * Gets the homework completion status.
     *
     * @return True if homework is done, otherwise false.
     */

    public void setHomeworkDone(boolean homeworkDone) {
        isHomeworkDone = homeworkDone;
    }


    public String getDinnerMeal() {
        return dinnerMeal;
    }

    public void setDinnerMeal(String dinnerMeal) {
        this.dinnerMeal = dinnerMeal;
    }

    // Method to check if today is good based on different factors
    public boolean isTodayGood() {
        if (isWeatherGood() && isHomeworkDone) {
            return true;
        } else if (isWeatherGood() && !isHomeworkDone) {
            // If the weather is good but homework isn't done; check dinner
            if (dinnerMeal.equalsIgnoreCase("Pizza")) {
                return true; // Dinner choice can still save the day!
            }
        }
        return false;
    }

    /**
     * Determines if the weather is considered good based on temperature and humidity.
     *
     * @return True if the weather is good (temperature between 70F and 85F and humidity less than 60%),
     *         otherwise false.
     */

    // Method to check if the weather is good
    public boolean isWeatherGood() {
        if (temperature > 70 && temperature < 85 && humidity < 60) {
            return true; // Weather is considered good if it's between 20-30 degrees and humidity < 60%
        }
        return false;
    }

    /**
     * Returns a string description of the current day's conditions
     *
     * @return A string describing the day's properties and overall assessment
     */

    // Return a description of the day based on various conditions
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Today's Weather: ");
        if (isWeatherGood()) {
            description.append("Good (Temperature: ").append(temperature)
                    .append("°F, Humidity: ").append(humidity).append("%). ");
        } else {
            description.append("Bad. ");
        }

        description.append("Homework Status: ").append(isHomeworkDone ? "Done" : "Not Done").append(". ");

        description.append("Dinner plan: ").append(dinnerMeal).append(". ");

        if (isTodayGood()) {
            description.append("Today is a good day!");
        } else {
            description.append("Today is not a good day.");
        }

        return description.toString();
    }

    /**
     * Resets all fields to their default values
     */

    //  Method for resetting all fields to default values
    public void resetDay() {
        this.temperature = 0;
        this.humidity = 0.0;
        this.isHomeworkDone = false;
        this.dinnerMeal = "None";
    }
}

