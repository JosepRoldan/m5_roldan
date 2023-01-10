import java.util.Scanner;

public class roldanVocals {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        String r = "";
        int tope = x.length();
        for(int i = 0;i<tope;i++){
            char l = x.charAt(i);
            if(!(l=='a' || l=='e' || l=='i' || l=='o' || l=='u')){
                r=r+l;
            }
        }
        System.out.println(r);
    }
}