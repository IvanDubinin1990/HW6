import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t***Программа определения весов товаров***\n\n\n");

        System.out.println("Введите первый вес: ");
        double first = new Scanner(System.in).nextDouble();

        System.out.println("Введите второй вес: ");
        double second = new Scanner(System.in).nextDouble();

        System.out.println("Введите третий вес: ");
        double third = new Scanner(System.in).nextDouble();

        double greatest = 0;
        double average = 0;
        double smallest = 0;
        //todo дописать логику программы ниже.

        if (first > second && first > third && second > third) {
            greatest = first;
            average = second;
            smallest = third;
        } else if (first > second && first > third && second < third) {
            greatest = first;
            average = third;
            smallest = second;
        } else if (second > first && second > third && first > third) {
            greatest = second;
            average = first;
            smallest = third;
        } else if (second > first && second > third && first < third) {
            greatest = second;
            average = third;
            smallest = first;
        } else if (third > first && third > second && first > second) {
            greatest = third;
            average = first;
            smallest = second;
        } else if (third > first && third > second && first < second) {
            greatest = third;
            average = second;
            smallest = first;
        }


        //todo


        System.out.println("Наибольший вес: " + greatest);
        System.out.println("Средний вес: " + average);
        System.out.println("Наименьший вес: " + smallest);
    }
}
