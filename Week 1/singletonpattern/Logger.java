public class Logger {
    // Private static instance
    private static Logger instance;

    // Private constructor
    private Logger() {
        System.out.println("Logger instance created");
    }

    // Public method to return the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Sample method to simulate logging
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
