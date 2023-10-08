import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int persons;
        double pricePerPersons = 0;

        while (true) {
            System.out.print("Введите количество человек: ");
            if (scanner.hasNextInt()) {
                persons = scanner.nextInt();

                if (persons >= 2) {
                    break;
                } else if (persons == 1) {
                    System.out.println("Вы за столом один. Пригласите друзей и попробуйте снова.");

                } else if (persons <= 0) {
                    System.out.println("Число персон не может быть отрицательным или нулевым. Попробуйте снова.");
                }
            } else {
                System.out.println("Введено некорректное значение. Попробуйте снова.");
                scanner.next();
            }
        }

        Calculator calculator = new Calculator();
        calculator.calculate();
     // тест   System.out.println(calculator.totalProductPrice);

        Formater formater = new Formater();
//        formater.formater(calculator.totalProductPrice);
//        System.out.println((calculator.totalProductPrice) + (formater.formater(calculator.totalProductPrice)));

        pricePerPersons = calculator.totalProductPrice / persons;
        formater.formater(pricePerPersons);

        System.out.println("Цена на одного человека: " + String.format("%.2f", pricePerPersons) + " " + formater.formater(pricePerPersons));
    }


}