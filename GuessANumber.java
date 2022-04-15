import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = (int) (Math.random() * 100);
        while(true) {
            int answer = scanner.nextInt();
            if (answer < number) {
                System.out.println("Моё число больше!");
            } else if (answer > number) {
                System.out.println("Моё число меньше");
            } else {
                System.out.println("Правильно!");
                break;
            }
        }
    }
}
