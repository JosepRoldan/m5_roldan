import java.util.Scanner;

public class roldanNumerosparells3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int numero2 = scanner.nextInt();
        if(numero<=numero2) System.out.println("True");
        else System.out.println("False");
    }
}