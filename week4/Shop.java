import java.util.Scanner;

public class Shop {

private Person owner;
private String address;
private Product productList[]=new Product[500];//initializes an array of name productlist
private static int productcount=0;
private static double revenue;//for using in sale method:
//constructor:
public Shop(Person owner,String address)
{this.owner=owner;
this.address=address;
this.productList=new Product[100];}//initialization of productList
//Getter and setter methods:
public void setOwner(Person owner){
this.owner=owner;}
public Person getOwner(){
return owner;}
public void setAddress(String address){
this.address=address;}
public String getAddress(){
return address;}

//Methods:
public void add(){
Scanner s=new Scanner(System.in);
System.out.println("Enter product details:");
System.out.println("Enter name:");
 String name=s.nextLine(); 
System.out.println("Enter price:");
 double price=s.nextDouble();
System.out.println("Enter quantity:");
 int quantity=s.nextInt();
//now passing these variables into the array:
Product product=new Product(name,price,quantity);
//Add the product to the array at the position indicated by productCount.
productList[productcount++]=product;

System.out.println("product added");}

public void sale(){

System.out.println("Sale Menu");
Scanner sc=new Scanner(System.in);
System.out.println("Enter product Id:");
String id=sc.nextLine();

for(int i=0;i<productcount;i++)//this ensures that all the products are checked in the list:
//Check if Product ID Matches:
if(productList[i].getId().equals(id)){
productList[i].setQuantity(productList[i].getQuantity()-1);
//the price of the product is added to the revenue:
revenue=revenue+productList[i].getPrice();
System.out.println("Sale successful");}
 else {
    System.out.println("Product not found");}
}
}
public void display(){
for(int i=0;i<productcount;i++)
{ if(productList[i]!=null)
{ System.out.println("Product Name:"+productList[i].getName());
System.out.println("Product price:"+productList[i].getPrice());
System.out.println("Product Quantity:"+productList[i].getQuantity());
System.out.println("Product Id:"+productList[i].getId());}
else{System.out.println("nothing to display");}
}
}
public void modify(){
 System.out.println("Enter the id of the product to modify");
Scanner scanner=new Scanner(System.in);
String id=scanner.nextLine();
System.out.println("Enter the new name of the product:");
Scanner c=new Scanner(System.in);
String name=c.nextLine();
for(int i=0;i<productcount;i++){
if (productList[i].getId().equals(id)){
productList[i].setName(name);
System.out.println("name updated");
}
else {
                System.out.println("Product not found");}
     
                     
                  }}

public void delete(){

System.out.println("Enter the id of the product to delete");
Scanner scanner=new Scanner(System.in);
String id=scanner.nextLine();
for(int i=0;i<productcount;i++){
if(productList[i].getId().equals(id)){
productList[i]=null;
 System.out.println("Product deleted");}
else{
 System.out.println("Product not found");}
}
}






































}
