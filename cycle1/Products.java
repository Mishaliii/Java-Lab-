package Lab;

public class Products {
    private int pcode;
    private String pname;
    private double price;

    // Constructor
    public Products(int pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Display product details
    public void displayProduct() {
        System.out.println("Product Code: " + pcode);
        System.out.println("Product Name: " + pname);
        System.out.println("Product Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating Product objects
        Products product1 = new Products(101, "Rice", 25);
        Products product2 = new Products(102, "Wheat", 15);
        Products product3 = new Products(103, "Corn", 30);

        // Finding the product with the lowest price
        Products lowestPriceProduct = product1;
        if (product2.getPrice() < lowestPriceProduct.getPrice()) {
            lowestPriceProduct = product2;
        }
        if (product3.getPrice() < lowestPriceProduct.getPrice()) {
            lowestPriceProduct = product3;
        }

        // Displaying the product with the lowest price
        System.out.println("Product with the lowest price:");
        lowestPriceProduct.displayProduct();
    }
}
