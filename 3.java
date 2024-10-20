import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int c = 0;
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            if (i == 0 || A[i] != A[i - 1]) {
                n[c] = A[i];
                c++;
            }
        }
        for (int i = 0; i < c; i++) {
            System.out.print(n[i] + " ");
        }
    }
}
