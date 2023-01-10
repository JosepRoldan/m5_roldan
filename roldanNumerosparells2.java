import java.util.Scanner;

public class roldanNumerosparells2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        int tope = x.length();
        char l = 0;
        char l2 = 0;
        for(int i = 0;i<tope;i++){
            l = x.charAt(0);
            l2 = x.charAt(1);
        }
        if(l<=l2){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}