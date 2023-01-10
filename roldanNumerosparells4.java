import java.util.Scanner;

public class roldanNumerosparells4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Definim el scanner i fem 4 entrades 
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();
        int numero4 = scanner.nextInt();
//A la variable boolean fem que si numero1 es mes petit que numero2 = true (true despres de comprovar els altres numeros)
        boolean r = (numero1 <= numero2 || numero2 <= numero3 || numero3 <= numero4);
        System.out.println(r);
    }
}