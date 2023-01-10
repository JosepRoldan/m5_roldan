import java.util.Scanner;
public class roldanOrdenats2_2 {
    public static void main(String[] args) {
        boolean a = true;
        Scanner scanner = new Scanner(System.in); //Definim el scanner 
        int n1 = scanner.nextInt();//Escrivim el primer numero
        for(int i = 0;i<3;i++ ){//Fem un bucle que es repiteix 3 vegades
            int n2 = scanner.nextInt();
            if (n2<n1) a=false;//Si el num 2 es mes gran que el numero 1 = false
            n1=n2;}
        System.out.println(a);}}