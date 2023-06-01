public class Program {
    public static void main(String[] args) {
        
        int a = 1;
        Product product1;

        product1 = new Product();
        product1.brand = "000 Best water";
        product1.name = "Water";
        product1.price = 100.12;
        System.out.println(product1.displayInfo());

    }    
}