public class Main {

    // Recursive method to calculate future value
    public static double forecast(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        // Recursively calculate value for each year
        return forecast(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double currentValue = 10000; // current amount
        double growthRate = 0.10;    // 10% annual growth
        int years = 5;               // forecast for 5 years

        double futureValue = forecast(currentValue, growthRate, years);
        System.out.printf("Future value after %d years: ₹%.2f\n", years, futureValue);
    }
}
