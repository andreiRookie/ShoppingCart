import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Product[] products = {
                new Product("Хлеб", 40),
                new Product("Молоко", 90),
                new Product("Гречневая крупа", 70),
                new Product("Бананы", 80),
                new Product("Манная крупа", 60)};

        System.out.println("<<<Список возможных товаров для покупки>>>");

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].getProductId() + ". " +
                    products[i].getName() + " - " + products[i].getPrice() + "руб/шт");
        }

        int shoppingCart = 0;

        while (true) {
            System.out.println("Введите номер товара и его количество, или `end` для итога:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("end")) {
                System.out.println("Корзина:\n" + Arrays.toString(products));
                System.out.println("Итого: " + shoppingCart + "руб");
                break;
            }

            String[] productIdAndCount = input.split(" ");
            int productId = Integer.parseInt(productIdAndCount[0]);
            int productCount = Integer.parseInt(productIdAndCount[1]);

            for (Product product : products) {
                if (productId == product.getProductId()) {
                    product.setProductCount(product.getProductCount() + productCount);
                    shoppingCart += product.getProductCount() * product.getPrice();
                }
            }
        }
    }
}