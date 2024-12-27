import java.util.Scanner;

public class Fylod_pyramid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n:::");
        int n = sc.nextInt(), num = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }

    }
}
