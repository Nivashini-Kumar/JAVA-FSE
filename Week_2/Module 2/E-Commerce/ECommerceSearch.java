import java.util.Arrays;
import java.util.Comparator;

public class ECommerceSearch {

    // Linear Search
    public static Product linearSearch(Product[] products, String searchName) {

        for (Product product : products) {
            if (product.name.equalsIgnoreCase(searchName)) {
                return product;
            }
        }

        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, String searchName) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int middle = (left + right) / 2;

            int result = products[middle].name.compareToIgnoreCase(searchName);

            if (result == 0) {
                return products[middle];
            }

            if (result < 0) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mobile", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Tablet", "Electronics")
        };

        Product linearResult = linearSearch(products, "Shoes");

        if (linearResult != null) {
            System.out.println("Linear Search Found: " + linearResult.name);
        }

        Arrays.sort(products,
                Comparator.comparing(product -> product.name));

        Product binaryResult = binarySearch(products, "Shoes");

        if (binaryResult != null) {
            System.out.println("Binary Search Found: " + binaryResult.name);
        }
    }
}
