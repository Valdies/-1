import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int den = Integer.parseInt(parts[0]);
        int mes = Integer.parseInt(parts[1]);
        int god = Integer.parseInt(parts[2]);
        String denNedeli = gospadiPomiluy(den, mes, god);
        System.out.println(denNedeli);
    }
    private static String gospadiPomiluy(int den, int mes, int god) {
        if (mes < 3) {
            mes += 12;
            god--;
        }
        int k = god % 100;
        int j = god / 100;
        int f = den + (13 * (mes + 1)) / 5 + k + (k / 4) + (j / 4) - (2 * j);
        int denNedeli = f % 7;
        String[] D = {"Saturday", "Sanday", "Monday", "Tuesday", "Wensday", "Thersday", "Friday"};
        return D[denNedeli];
    }
}
