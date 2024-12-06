import java.util.Scanner;

public class FindingMostAuspiciousPeak {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[] H = new int[N];
            int[] A = new int[M];
            for (int i = 0; i < N; i++) {
                H[i] = sc.nextInt();
            }

            for (int j = 0; j < M; j++) {
                A[j] = sc.nextInt();
            }

            int maxScore = 0;
            int bestNumber = A[0];
            for (int j = 0; j < M; j++) {
                int currentNumber = A[j];
                int count = 0;

                for (int i = 0; i < N; i++) {
                    if (H[i] % currentNumber == 0) {
                        count++;
                    }
                }

                if (count > maxScore) {
                    maxScore = count;
                    bestNumber = currentNumber;
                } else if (count == maxScore && currentNumber < bestNumber) {
                    bestNumber = currentNumber;
                }
            }

            System.out.println(bestNumber);
        }
    }


}