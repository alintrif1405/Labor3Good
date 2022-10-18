import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Product implements Comparable<Product>{
    private double BasePrice;
    private int Days;

    public double getBasePrice() {
        return BasePrice;
    }

    public void setBasePrice(double basePrice) {
        BasePrice = basePrice;
    }

    public Product(double basePrice, int days) {
        BasePrice = basePrice;
        Days = days;
    }

    public int getDays() {
        return Days;
    }

    public void setDays(int days) {
        Days = days;
    }

    public double Reduced_Price(){
        if(this.Days>10&&this.Days<20)return this.BasePrice=this.BasePrice*0.9;
        else if(this.Days>20)return this.BasePrice=this.BasePrice*0.8;
        this.BasePrice=(double)Math.round(this.BasePrice*20.0)/20.0;
        return this.BasePrice;
    }
    public double SumOfProducts(List<Product> List){
        double Sum=0;
        for(Product product:List)
            Sum=Sum+product.Reduced_Price();
        return Sum;
    }
    public List<Product> HigherThan100(List<Product> List){
        List<Product> ProductsHigherThan100 = new ArrayList<>();
        for(Product product:List)
            if(product.Reduced_Price()>100)
                ProductsHigherThan100.add(product);
        return ProductsHigherThan100;

    }
    public List<Product> SortedAfterPrice(List<Product> List){
        List<Product> SortedAfterPriceNew=new ArrayList<>();
        Collections.sort(SortedAfterPriceNew);
        return SortedAfterPriceNew;
    }
    public void ExpensiveCheap(List<Product> List){
        Collections.sort(List);

        System.out.println("Cheapest"+List.get(0).getBasePrice()+"Most Expensive:"+List.get(List.size()-1));
    }
    @Override
    public int compareTo(Product P) {
        double comparePrice = ((Product)P).Reduced_Price();

        //  For Ascending order
        return (int) (this.Reduced_Price() - comparePrice);

        // For Descending order do like this
        // return compareage-this.studentage;
    }
}
//@Override public int compareTo(Student comparestu) {
//    int compareage
//            = ((Student)comparestu).getStudentage();
//
//    //  For Ascending order
//    return this.studentage - compareage;
//
//    // For Descending order do like this
//    // return compareage-this.studentage;
//}

