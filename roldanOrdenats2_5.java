import java.util.Scanner;
public class roldanOrdenats2_5 {
    public static void main(String[] args) {
        boolean a = true;
        int linea = 0;
        Scanner scanner = new Scanner(System.in);
        for(int i = 1;i<5;++i ){
            if (i % 2 == 0){
                a=true;
                linea = i;}
            else a=false;
            System.out.println(a);}
            System.out.println("El ultim true esta a la linea " + linea);}}