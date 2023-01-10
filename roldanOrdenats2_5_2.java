import java.util.Scanner;
public class roldanOrdenats2_5_2 {
    public static void main(String[] args) {
        boolean a = true;
        int linea = 0;
        Scanner scanner = new Scanner(System.in);
        for(int i = 1;i<=4;++i ){
            a = scanner.nextBoolean();
            if (a == true){
                linea = i;
            }}
            System.out.println("El ultim true esta a la linea " + linea);}}