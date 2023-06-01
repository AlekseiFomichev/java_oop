package ru.geekbrains.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        int a = 1;
        Product product1;

        product1 = new Product("ООО Лучшая вода", "Бу", -100.12);
        //product1.brand = "ООО Лучшая вода";
        //product1.name = "Бутылка с водой";
        //product1.price = -50;
        //product1.name = "A";
        System.out.println(product1.displayInfo());

        Product bottleOfWater1 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [1]", 115, 1);
        Product bottleOfWater2 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [2]", 215, 1.5);
        BottleOfWater bottleOfWater3 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [3]", 1115, 1.5);
        Product bottleOfWater4 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [4]", 55, 2);
        Product bottleOfMilk1 = new BottleOfMilk("ООО Чистый источник", "Бутылка с молоком", 115, 1.5, 10);

        Product Choco1 = new Choco("Slavyanka", "STEP", 40, 100, 500);
        Product Choco2 = new Choco("Slavyanka", "STEP with nuts", 40, 100, 500);

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater4);
        products.add(bottleOfWater3);
        products.add(Choco1);
        products.add(Choco1);
        products.add(Choco2);

        VendingMachine vendingMachine = new VendingMachine(products);
//        BottleOfWater bottleOfWaterResult = vendingMachine.getBottleOfWater(2);
//        if (bottleOfWaterResult != null){
//            System.out.println("Вы купили: ");
//            System.out.println(bottleOfWaterResult.displayInfo());
//        }
//        else {
//            System.out.println("Такой бутылки с водой нет в автомате.");
//        }

        Choco chockolateRes = vendingMachine.getChockolate(500);
        if (chockolateRes != null){
            System.out.println("Вы купили: ");
            System.out.println(chockolateRes.displayInfo());
        }
        else {
            System.out.println("Такого шоколада нет в наличии");
        }

    }

}
