import java.util.Arrays;
import java.util.Comparator;

class Product {
    int productId;
    String productName;
    String category;

    Product(int id, String name, String category) {
        this.productId = id;
        this.productName = name;
        this.category = category;
    }

    public String toString() {
        return "[" + productId + "] " + productName + " - " + category;
    }
}

public class Main {

    // Linear search by name
    public static Product linearSearch(Product[] products, String name) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    // Binary search by name (sorted array required)
    public static Product binarySearch(Product[] products, String name) {
        int low = 0, high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int compare = products[mid].productName.compareToIgnoreCase(name);

            if (compare == 0) {
                return products[mid];
            } else if (compare < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shirt", "Clothing"),
            new Product(103, "Book", "Education"),
            new Product(104, "Phone", "Electronics")
        };

        // --- Linear Search ---
        System.out.println("🔍 Linear Search:");
        Product result1 = linearSearch(products, "Phone");
        System.out.println(result1 != null ? "Found: " + result1 : "Not found");

        // --- Sort array for Binary Search ---
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        // --- Binary Search ---
        System.out.println("\n🔍 Binary Search:");
        Product result2 = binarySearch(products, "Phone");
        System.out.println(result2 != null ? "Found: " + result2 : "Not found");
    }
}
