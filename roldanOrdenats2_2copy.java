import java.util.Scanner;

public class roldanOrdenats2_2copy {
    public static void main(String[] args) {
        int a = 0;
        Scanner scanner = new Scanner(System.in); //Definim el scanner 
        int n1 = scanner.nextInt();
        for(int i = 0;i<3;i++ ){
            int n2 = scanner.nextInt();
            if(n1<=n2) {
                n1=n2;
            }
            else if(n2<n1) {
                a++;
            }
        }
        if (a>0)System.out.println("False");
        else System.out.println("True");
    }
}
