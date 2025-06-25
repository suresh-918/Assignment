import java.util.Scanner;
public class Problem_3 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number (a): ");
        int a = sc.nextInt();

        // If 'a' is even, reduce it by 1 to get previous odd number
        if (a % 2 == 0) {
            a = a - 1;
        }

        System.out.print("Output: ");
        for (int i = 1; i <= a; i ++) {
            int odd = 2 * i - 1;
            System.out.print(odd);
            if (i != a) {
                System.out.print(", ");
            }
        }

        sc.close();
	}

}
