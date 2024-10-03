import java.util.Objects;
public class Product {
private String id;
private String name;
private double price;
private int quantity;
private static int counter=1;

    public Product(String name,double price,int quantity) {

    this.id=String.format("%03d",++counter);
    this.name=name;
    this.price=price;
    this.quantity=quantity;}
    Product(String name,double price)
    { this(name,price,0);
    }

Product (String name)
{this(name,0,0);}



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
public void setPrice(double price){
this.price=price;}
public double getPrice(){ return price;}
public int getQuantity(){
return quantity;}
public void setQuantity(int quantity){this.quantity=quantity;}
    public String getId() {
        return id;
    }

    public boolean equals(Object o){
if (this==o) return true;
if (o == null || getClass() != o.getClass()) return false;
Product product=(Product) o;
return Objects.equals(id, product.id) ;
}
    public String toString() {
        return String.format("Product ID:%s\n Name:%s\n Price:%f\n Quantity:%d",id,name, price, quantity);
    }
}








