package Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
public class ProductManagement {
    private static  Product[] products = new Product[100];
    static {
        products[0]=new Product(1,"Cam",20000);
        products[0]=new Product(2,"Chanh",15000);
        products[0]=new Product(1,"Xoài",25000);
    }
    public void display(){
        for (int i = 0; i <products.length ; i++) {
            if (products[i]!=null){
                System.out.println(products[i]);
            }
        }
    }
    public void add(Product[] products){
        for (int i=0;i<products.length;i++){
            if (products[i]==null){
                products[i]=products;
                break;
            }
        }
    }
}
