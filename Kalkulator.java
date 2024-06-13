import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Prosty Kalkulator:");

        while (true) {
            System.out.print("Podaj pierwszą liczbę: ");
            double liczba1 = scanner.nextDouble();

            System.out.print("Podaj operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Podaj drugą liczbę: ");
            double liczba2 = scanner.nextDouble();

            double wynik = 0;
            boolean blad = false;

            switch (operator) {
                case '+': wynik = liczba1 + liczba2; break;
                case '-': wynik = liczba1 - liczba2; break;
                case '*': wynik = liczba1 * liczba2; break;
                case '/':
                    if (liczba2 != 0) {
                        wynik = liczba1 / liczba2;
                    } else {
                        System.out.println("Błąd: Dzielenie przez zero!");
                        blad = true;
                    }
                    break;
                default:
                    System.out.println("Błąd: Nieprawidłowy operator!");
                    blad = true;
            }

            if (!blad) {
                System.out.println("Wynik: " + wynik);
            }

            System.out.print("Naciśnij Enter, aby zakończyć...");
            scanner.nextLine();
            scanner.nextLine();
            break;
        }

        System.out.println("Kalkulator zakończył działanie.");
        scanner.close();
    }
}
