import java.util.Scanner;


public class Calculator {
    String productList = "";
    double totalProductPrice = 0;



    public void calculate() {
        Scanner scanner = new Scanner(System.in);
        Formater formater = new Formater();

        while (true) {
            System.out.print("Введите название товара или \"Завершить\": ");
            String productName = scanner.nextLine();

            if (productName.equalsIgnoreCase("Завершить") || productName.equalsIgnoreCase("pfdthibnm")) {
                break;
            } else {
                System.out.print("Введите стоимость товара в формате рубли.копейки:");
                double priceForOne;

                while (true) {
                    if (scanner.hasNextDouble()) {
                        priceForOne = scanner.nextDouble();
                        scanner.nextLine();
                        break;
                    } else {
                        System.out.println("Неверный формат стоимости товара. Попробуйте снова!");
                        scanner.nextLine();
                    }
                }

                if (priceForOne < 0) {
                    System.out.println("Ценане может быть отрицательной. Попробуйте снова!");
                    continue;
                }

                if (productName.trim().isEmpty()) {
                    System.out.println("Название товара не может быть пустым. Попробуйте снова!");
                    continue;
                }

                this.productList = productList + productName + " : " + String.format("%.2f", priceForOne) + " " +formater.formater(priceForOne) + "\n" ;
                this.totalProductPrice = totalProductPrice + priceForOne;

                System.out.println("Товар " + productName + " : " + String.format("%.2f", priceForOne) + " " + formater.formater(priceForOne) +" добавлен");

            }
        }
        scanner.close();



        System.out.println("Добавленные товары:\n" + productList);
        System.out.println("Сумма всех товаров: " + String.format("%.2f", totalProductPrice) + " " + " " +formater.formater(totalProductPrice));
    }






}