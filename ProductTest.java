import java.util.Scanner;
public class ProductTest {
    public static void main(String[] args) {
Shop shop=new Shop(new Person("hiba","email"),"lahore");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter 1 to add product\n Enter 2 for sale\n Enter 3 to remove product\n Enter 4 to Display\n Enter 5 to modify product\n Enter 6 to Search product\n ");
        int choice= sc.nextInt();
        switch (choice) {
            case 1:
                shop.add();
                break;
            case 2:
                shop.sale();
                break;
            case 3:
                shop.removeProduct();
                break;
            case 4:
                shop.display();
                break;
            case 5:
                shop.modifyProduct();
                break;
            case 6:
                shop.search();
                break;

            case 0:
                System.exit(0);
                break;
            default:
        }



    }



}














