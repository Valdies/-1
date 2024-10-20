import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] A = new int[n][];
        for (int i = 0; i < n; i++) {
            A[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        int otv = OGospodi(A);
        System.out.println(otv);
    }
    private static int OGospodi(int[][] A) {
        for (int i = A.length - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                A[i][j] += Math.max(A[i + 1][j], A[i + 1][j + 1]);
            }
        }
        return A[0][0];
    }
}
