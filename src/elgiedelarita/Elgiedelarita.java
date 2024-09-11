package elgiedelarita;

import java.util.Scanner;

public class Elgiedelarita {

    class Product {

        int id;
        String name;
        String category;
        int stockQuantity;
        double priceperunit;
        private final double pricePerunit;

        public Product(int id, String name, String category, int stockQuantity, double pricePerunit) {

            this.id = id;
            this.name = name;
            this.category = category;
            this.stockQuantity = stockQuantity;
            this.pricePerunit = pricePerunit;

        }

        public String toString() {
            String pricePerUnit = null;
            return "ID: " + id + "\nName: " + name + "\nCategory: " + category + "\nStock Quantity: " + stockQuantity
                    + "\nPrice Per Unit: $" + pricePerUnit + "\n";
        }
    }

    public class ProductInventoryManagement {
        public static void main(String[])args{
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Enter details of the product:");
                System.out.print("ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Category: ");
                String category = scanner.nextLine();
                System.out.print("Stock Quantity: ");
                int stockQuantity = scanner.nextInt();
                System.out.print("Price Per Unit: ");
                double pricePerUnit = scanner.nextDouble();
                
                Product product = new Product(id, name, category, stockQuantity, pricePerUnit);
                
                System.out.println("\nProduct Details:");
                System.out.println(product.toString());
            }
        }
    }

}
