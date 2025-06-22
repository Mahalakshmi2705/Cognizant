public class Main {
    public static void main(String[] args) {
        // Getting two instances
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Log messages
        logger1.log("First message");
        logger2.log("Second message");

        // Check if both instances are the same
        if (logger1 == logger2) {
          
            System.out.println("Singleton works: Only one instance exists.");
        } else {
            System.out.println("Singleton failed: Multiple instances exist.");
        }
    }
}

