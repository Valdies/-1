import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder compressed = new StringBuilder();
        char sjat = input.charAt(0);
        int C = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == sjat) {
                C++;
            } else {
                compressed.append(sjat).append(C);
                sjat = input.charAt(i);
                C = 1;
            }
        }
        compressed.append(sjat).append(C);
        System.out.println(compressed.toString());
    }
}
