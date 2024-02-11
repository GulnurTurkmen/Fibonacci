package Fibonacci;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        int numElements = scanner.nextInt();
        if (numElements < 1) {
            System.out.println("Eleman sayısı 1'den az olamaz.");
            return;
        }
        int a = 0, b = 1;
        System.out.print("0 1 ");
        for (int i = 2; i <= numElements; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        System.out.println();
    }
}