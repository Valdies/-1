import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int razvorot = 0;
        while (N > 0) {
            int digit = N % 10;
            razvorot = razvorot * 10 + digit;
            N /= 10;
        }
        System.out.println(razvorot);
    }
}
