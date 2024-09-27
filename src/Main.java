
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        System.out.println("--------------------------");
        for ( int i = 1; i <=10; i++ ) {
            System.out.print(" " + i);
        }
        System.out.println("\n" + "--------------------------" + "\n");

        System.out.println("Задача 2");
        System.out.println("--------------------------");

        for ( int x = 10; x >= 1; x--) {
            System.out.print(" " + x);
        }
        System.out.println("\n" + "--------------------------" + "\n");

        System.out.println("Задача 3");
        System.out.println("--------------------------");
        System.out.print("Все четные числа из 17: ");
        for (int y = 2; y <= 17; y = y+2) {
            System.out.print(" " + y);
        }
        System.out.println("\n" + "--------------------------" + "\n");

        System.out.println("Задача 4");
        System.out.println("--------------------------");
        for (int k = 10; k >= -10; k--) {
            System.out.print(" " + k);
        }
        System.out.println("\n" + "--------------------------" + "\n");

        System.out.println("Задача 5");
        System.out.println("--------------------------");
        for (int c = 1904; c <= 2096; c = c + 4) {
            System.out.print(" " + c);
        }
        System.out.println("\n" + "--------------------------" + "\n");

        System.out.println("Задача 6");
        System.out.println("--------------------------");
        for (int d = 7; d <= 98; d = d + 7) {
            System.out.print(" " + d);
        }
        System.out.println("\n" + "--------------------------" + "\n");

        System.out.println("Задача 7");
        System.out.println("--------------------------");
        for (int e = 1; e <=512; e = e * 2) {
            System.out.print(" " + e);
        }
        System.out.println("\n" + "--------------------------" + "\n");

        System.out.println("Задача 8");
        System.out.println("--------------------------");
        int h = 29000;
        for (int f = 1; f <= 12; f++) {
            System.out.println("Месяц " + f + " сумма накоплений равна " + h + " рублей");
            h = h + 29000;
        }
        System.out.println("\n" + "--------------------------" + "\n");

        System.out.println("Задача 9");
        System.out.println("--------------------------");
        double j = 29000;
        for (int g = 1; g <= 12; g++) {
            System.out.println("Месяц " + g + " сумма накоплений равна " + j + " рублей");
            j = (float) (j + (j * 0.1));
        }
        System.out.println("\n" + "--------------------------" + "\n");

        System.out.println("Задача 9");
        System.out.println("--------------------------");
        for (int l = 1; l <= 10; l++) {
            System.out.print(" " + (l * 2));
        }
        System.out.println("\n" + "--------------------------" + "\n");
         }
}