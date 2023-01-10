import java.util.Scanner;
public class roldanOrdenats2_3 {
    public static void main(String[] args) {
        boolean a = true;
        Scanner scanner = new Scanner(System.in); //Definim el scanner 
        System.out.println("Posa el tope");
        int tope = scanner.nextInt();
        if (tope == 0){
            System.out.println(a);
            System.exit(0);}
        tope--;
        System.out.println("Posa els numeros");
        int n1 = scanner.nextInt();//Escrivim el primer numero
        for(int i = 0;i<tope;i++ ){//Fem un bucle que es repiteix 3 vegades
            int n2 = scanner.nextInt();
            if (n2<n1) a=false;//Si el num 2 es mes gran que el numero 1 = false
            n1=n2;}
        System.out.println(a);}}