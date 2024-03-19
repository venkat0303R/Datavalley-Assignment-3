
import java.io.*;

class Product implements Serializable {
    private int id;
    private String name;
    private String category;
    private double price;

    public Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public void printDetails() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Category: " + category);
        System.out.println("Product Price: " + price);
    }
}

public class Deserialization {
    public static void main(String[] args) {
        
        Product pd = new Product(1, "Tablet", "Electronics", 9999.99);
        serializeProduct(pd, "product.ser");

        // Deserialize object
        Product deserializedProduct = deserializeProduct("product.ser");
        if (deserializedProduct != null) {
            System.out.println("Deserialized Product Details:");
            deserializedProduct.printDetails();
        }
    }

    public static void serializeProduct(Product product, String filename) {
        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(product);
            System.out.println("Serialized product is saved in " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Product deserializeProduct(String filename) {
        Product product = null;
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            product = (Product) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return product;
    }
}
