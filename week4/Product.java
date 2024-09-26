public class Product{
private String name;
private String id;
private double price;
private int quantity;
private static int counter=0;

//Constructor 1:
Product(String name,String id,double price,int quantity){
this.name=name;
 this.id = String.format("%03d", ++counter);
this.price=price;
this.quantity=quantity;}
//Constructor2:
Product(String name,double price){
this(name,price,0);
/*this.name=name;
this.price=price;*/
}
//Constructor3:
Product(String name){
this(name,0);}
//equals method:
public boolean equals(Object o){
Product=(Product)o;
/*// Self-check(sir's method):
    if (this == o) {
        return true;
    }

    // Null and type check
    if (o == null || getClass() != o.getClass()) {
        return false;
    }*/
return this.id.equals(product.id)}
//tostring method:
public String toString(){
return String.format("%s %s %f %d",name,id,price,quantity);


//Setter and getter methods:
public void setName(String name){
this.name=name;}
public String getName(){
return name;}
public void setId(int id){
this.id=id;}
public int getId(){
return id;}
public void setPrice(double price){
this.price=price;}
public double getPrice(){
return price;}
public void setQuantity(int quantity){
this.quantity=quantity;}
public int getQuantity(){
return quantity;}




}