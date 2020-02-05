package associations;



public class OrderItem {
    Product p1;
    int quantity;



    // A constructor that initializes the product and quantity
    public OrderItem(Product p1, int quantity){
        this.p1= p1;
        this.quantity=quantity;
    }

  // getProduct() - Returns a reference to the Product object purchased
public Product getProduct(){

        return p1;

}
  // getQuantity() - Returns an integer indicating how many products were purchased
public int getQuantity(){
        return quantity;
}

  // getPrice() - Returns the price of this item, based on the unit price of the product and the quantity
public double getPrice(){

    double price= p1.getUnitPrice()*quantity;
        return price;
}
}
