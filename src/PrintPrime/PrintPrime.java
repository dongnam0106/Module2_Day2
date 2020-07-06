package PrintPrime;

import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args) {
        int numbers;
        int count = 0;
        int N = 2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("So luong so nguyen to: ");
        numbers = scanner.nextInt();

            while (count < numbers){
                int i = 2;
                boolean check = true;
                while (i <= Math.sqrt(N)) {
                    if (N % i == 0) {
                        check = false;
                        break;
                    }
                    i++;
                }
                if (check){
                    System.out.println(N);
                    count++;
                }
                N++;
            }
    }
}
