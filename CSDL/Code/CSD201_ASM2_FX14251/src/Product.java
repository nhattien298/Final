/**

 * Product class

 */

public class Product {
    private String bCode , title;
    private int quantity;
    private double price;


    /**

     * Default constructor

     */

    public Product() {

    }



    /**

     * Constructor method to initialize a product

     *

     * @param bCode    Product's bar code

     * @param title    Product's title

     * @param quantity Product's quantity

     * @param price    Product's price

     */

    public Product(String bCode, String title, int quantity, double price) {
        this.bCode = bCode;
        this.title = title;
        this.quantity = quantity;
        this.price = price;
    }

    /**

     * Convert this product to String for printing

     */

    @Override

    public String toString() {
        return String.format("%-15s | %-15s | %-15d | %-15.1f", bCode, title, quantity, price);
    }
/*
* Getter and Seter
 */

    public String getbCode() {
        return bCode;
    }

    public void setbCode(String bCode) {
        this.bCode = bCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
