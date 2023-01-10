import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] noms = new String[10];
        for (int i = 0; i < noms.length; i++){
            noms[i] = scanner.next();
        }
    }
}
