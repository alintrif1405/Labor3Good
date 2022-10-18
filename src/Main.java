import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product P1=new Product(2.23,9);
        Product P=new Product(12.23,2);
        List<Product> List=new ArrayList<>();
        List.add(P);
        List.add(P1);
        System.out.println(List);
        System.out.println();
    }
}