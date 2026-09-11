import java.util.*;

public class TotalNumberOfDigitsCount{

    // User-defined method
    public static int totalNumbers(int[] digits) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < digits.length; i++) {

            // First digit cannot be 0
            if (digits[i] == 0) {
                continue;
            }

            for (int j = 0; j < digits.length; j++) {

                // Same digit cannot be used again
                if (j == i) {
                    continue;
                }

                for (int k = 0; k < digits.length; k++) {

                    // Same digit cannot be used again
                    if (k == i || k == j) {
                        continue;
                    }

                    // Last digit must be even
                    if (digits[k] % 2 == 0) {

                        int num = digits[i] * 100
                                + digits[j] * 10
                                + digits[k];

                        set.add(num);
                    }
                }
            }
        }

        return set.size();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of digits: ");
        int n = sc.nextInt();

        int[] digits = new int[n];

        // Input digits
        System.out.println("Enter the digits:");
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }

        // Calling user-defined method
        int result = totalNumbers(digits);

        // Output
        System.out.println("Total 3-digit numbers = " + result);

        sc.close();
    }
}