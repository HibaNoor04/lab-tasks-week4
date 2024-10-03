import java.util.Scanner;
public class Shop {
    Product productList[]=new Product[100];
    private Person owner;
    private String address;
    private static int productcount=0;
    private static double revenue;
    {
        productList[productcount++]=new Product("Milk",200,17262);
        productList[productcount++]=new Product("Cheese",300,102);
        productList[productcount++]=new Product("Yogurt",130,16);
        productList[productcount++]=new Product("Ice cream",550,2876);


    }
    public void setOwner(Person on){
        this.owner=on;
    }

    public void setAddress(String ad){
        this.address=ad;

    }
    public Person getOwner(){

        return owner;
    }

    public String getaddress(){

        return address;

    }
    public Shop(Person owner, String address) {
        this.owner = owner;
        this.address = address;}

    //generic function for id searching:
    public int find(String id){
        for(int i=0;i<productcount;i++){
            if(productList[i].getId().equals(id)){
                return i;
            }}
             return -1;

    }
    public void add(){
        Scanner input=new Scanner(System.in);

        String name=input.nextLine();
        System.out.println("name"+name);
        System.out.print("Price: ");
        double price = input.nextDouble();
        System.out.print("Quantity: ");
        int quantity = input.nextInt();
        Product product=new Product(name,price,quantity);
        productList[productcount++]=product;
        System.out.println("Product added");


    }
    public void sale(){
        Scanner c=new Scanner(System.in);
        System.out.println("enter id:");
        String id=c.nextLine();
    //usinf the generic func we made:
int index=find(id);

    for(int i=0;i<productcount;i++){
       if(productList[i].getId().equals(id)){
           productList[i].setQuantity(productList[i].getQuantity()-1);
            System.out.println(productList[i].getQuantity());
            revenue=+productList[i].getPrice();
            System.out.println("Sale successful");}

            else{
            System.out.println("Product not found");}
        }
}
    public void removeProduct(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter id:");
        String id= s.nextLine();
       // for(int i=0;i<productcount;i++)
       // if(productList[i].getId().equals(id)){
            int index=find(id);
            if(index!=-1){
                productList[index]=null;

            System.out.println("Product removed");

        }
        else{
            System.out.println("Product not found");
        } }
     public void display(){for(int i=0;i<productcount;i++){
         if(productList[i]!=null){
             System.out.println(productList[i]);
             System.out.println("__________________");

         }
     }
     }
    public void modifyProduct(){
            Scanner s1=new Scanner(System.in);
        System.out.println("Enter id:");

        String newid= s1.nextLine();
        int index=find(newid);

        if (index!=-1){
        System.out.println("Enter new name:");
            String newname= s1.nextLine();
            productList[index].setName(newname);
            System.out.println("enter new price:");
            double nprice=s1.nextDouble();
            productList[index].setPrice(nprice);
            System.out.println("enter new quantity:");
            int nquantity=s1.nextInt();
            productList[index].setQuantity(nquantity);}
        else{
            System.out.println("Product not found");
        } }
        public void search(){
            Scanner s=new Scanner(System.in);
            System.out.println("enter id");
            String id= s.nextLine();
            int index=find(id);
            if(index!=-1){
                System.out.println(productList[index]);
                System.out.println("Product searched");
            }
            else{
                System.out.println("Product not found");
            }

        }
}