import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pervoe = scanner.nextLine();
        String vtoroe = scanner.nextLine();
        if (zadacha(pervoe, vtoroe)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }
    private static boolean zadacha(String str1, String str2) {
        String A = str1.replaceAll("\s+", "").toLowerCase();
        String B = str2.replaceAll("\s+", "").toLowerCase();
        if (A.length() != B.length()) {
            return false;
        }
        int[] N = new int[26];
        for (int i = 0; i < A.length(); i++) {
            N[A.charAt(i) - 'a']++;
            N[B.charAt(i) - 'a']--;
        }
        for (int count : N) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
