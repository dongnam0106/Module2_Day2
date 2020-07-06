package PrintPrime2;

public class PrintPrime2 {
    public static void main(String[] args) {
        int number = 100;
        int N = 2;

        while (N < number){
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
            }
            N++;
        }
    }
}
