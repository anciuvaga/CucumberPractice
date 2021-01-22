package appPages;

import java.util.ArrayList;
import java.util.List;

public class Product {

    String productName;
    int price;

    public Product(String productName, int price){
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<String> getProductList() {
        List <String> productList = new ArrayList<>();
        productList.add("Apple MacBook Pro");
        productList.add("Apple MacBook Air");
        productList.add("Apple iPhone 12");
        return productList;
    }
}
