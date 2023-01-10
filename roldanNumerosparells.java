import java.util.Scanner;

public class roldanNumerosparells {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        String r = "";
        int tope = x.length();
        for(int i = 0;i<tope;i++){
            char l = x.charAt(i);
            if(!(l=='1' || l=='3' || l=='5' || l=='7' || l=='9')){
                r=r+l;
            }
        }
        System.out.println(r);
    }
}