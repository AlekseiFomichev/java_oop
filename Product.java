package Lesson1;

public class Product {
    
    private String name;
    private String brand;
    private double price;

    double getPrice(){
        return price;
    }

    void setPrice(double inputPrice){
        price = inputPrice;
    }
    
    Product(){
        brand = "noname";
        name = "product";
        price = 100;
    
    }

    Product(String inputName, double inputPrice){
        brand = "noname";
        name = inputName;
        price = inputPrice;
    
    }


    Product(String inputBrand, String inputName, double inputPrice){
        if (inputPrice <= 0){
            price = 100;
        }
        ekse {
            price = inputPrice;
        }
        brand = inputBrand;
        name = inputBrand;
        price = inputPrice;
    }

    void checkPrice(double inputPrice)

    String displayInfo(){
        return String.format("%s - %s -%f", brand, name, price);
    }
}
