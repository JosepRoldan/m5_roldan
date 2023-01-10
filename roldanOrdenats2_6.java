import java.util.Scanner;
public class roldanOrdenats2_6 {
    public static void main(String[] args) {
        boolean b = true;
        Scanner scanner = new Scanner(System.in);
        int ultima_linea_ordenada = 0;
        int llargada_serie_de_numeros = 0;
        int contador_de_linea = 1;
        while(scanner.hasNext()){
            contador_de_linea++;
            llargada_serie_de_numeros = scanner.nextInt();
            if (llargada_serie_de_numeros == 0){
                b=true;
                System.out.println(b);
                System.exit(0);}
            int numero1 = scanner.nextInt();
            for(int i = 0;i<llargada_serie_de_numeros-1;i++ ){
                int numero2 = scanner.nextInt();
                if (numero1<numero2){
                    numero1=numero2;
                    ultima_linea_ordenada = contador_de_linea;
                    b = true;}
                if (numero2<numero1) b=false;}}
        if (ultima_linea_ordenada == 0) System.out.println("No hi ha cap serie ordenada");
        System.out.println("La ultima linea ordenada es " + ultima_linea_ordenada);}}