import java.util.*;

public class TheProhibitedRangeProblem{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxSum = scanner.nextInt();
        int bannedSize = scanner.nextInt();

        boolean[] banned = new boolean[n + 1];
        for (int i = 0; i < bannedSize; i++) {
            int bannedItem = scanner.nextInt();
            if (bannedItem <= n) {
                banned[bannedItem] = true;
            }
        }

        int totalWeight = 0;
        int itemCount = 0;

        for (int weight = 1; weight <= n; weight++) {
            if (!banned[weight]) {
                if (totalWeight + weight <= maxSum) {
                    totalWeight += weight;
                    itemCount += 1;
                } else {
                    break;
                }
            }
        }
        System.out.println(itemCount);

        scanner.close();
    }
}
