import java.util.Scanner;

public class Lab1_83 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter n: ");
        int a=scanner.nextInt();
        // for outer loop
        for (int i=1; i<=a;i++) {
            // for white-spaces
            for (int j=(a-1);j>=i;j--) {
                System.out.print(" ");
            }
            // to print star
            for (int k=1;k<=(2*i-1);k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }

