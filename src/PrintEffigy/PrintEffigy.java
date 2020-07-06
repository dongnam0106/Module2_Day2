package PrintEffigy;

import java.util.Scanner;

public class PrintEffigy {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();
        System.out.println("Enter width: ");
        int width = input.nextInt();
        System.out.println("Enter height: ");
        int height = input.nextInt();

        switch (choice){
            case 1:
                for (int i = 0; i < height; i++){
                    for (int j = 0; j < width; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            case 2:
                for (int i = 0; i <= height; i++){
                    for ( int j = 0; j <= i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            case 3:
                for (int i = 1; i <= height; i++){
                    for(int j = 1; j <= height - i; j++){
                        System.out.print(" ");
                    }
                    for(int j = 1; j <= 2*i -1; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
        }
    }
}
